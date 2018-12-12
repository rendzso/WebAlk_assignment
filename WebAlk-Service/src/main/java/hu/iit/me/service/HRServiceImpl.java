package hu.iit.me.service;

import hu.iit.me.dao.JobDAO;
import hu.iit.me.model.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class HRServiceImpl implements HRService{

    @Autowired
    private JobDAO jobDAO;

    @Override
    public void addNewJob(Job newJob) {
        jobDAO.job_add(newJob);
    }

    @Override
    public Collection<Job> listByHR() {
        ArrayList<Job> job = new ArrayList(jobDAO.job_list());

        Collections.sort(job, new Comparator<Job>() {
            @Override
            public int compare(Job job1, Job job2) {
               return job1.getHR_ID().compareToIgnoreCase(job2.getHR_ID());
            }
        });

        return job;
    }


    @Override
    public Collection<Job> searchHR(String HR) {

        Collection<Job> job = new ArrayList<>();

        for(Job jobs : jobDAO.job_list()){
            if(jobs.getHR_ID().equals(HR)){
                job.add(jobs);
            }
        }

        return job;

    }

    @Override
    public Job searchWithID(int ID) {
        for(Job jobs : jobDAO.job_list()){
            if(jobs.getJob_ID() == ID){
                return jobs;
            }
        }
        return null;

    }

    @Override
    public Collection<Job> listByHRWithDegreese(String HR) {
        ArrayList<Job> job = new ArrayList<>();

        for(Job jobs : jobDAO.job_list()){
            if(jobs.getHR_ID().equals(HR)){
                job.add(jobs);
            }
        }

        Collections.sort(job, new Comparator<Job>() {
            @Override
            public int compare(Job job1, Job job2) {
                if(job1.getJob_Money() <= job2.getJob_Money()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        return job;
    }
}
