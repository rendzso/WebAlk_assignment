package hu.iit.me.service;

import hu.iit.me.dao.JobDAO;
import hu.iit.me.model.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class JobServiceImpl implements JobService {

    @Autowired
    private JobDAO jobDAO;

    @Override
    public Collection<Job> job_list() {
        return jobDAO.job_list();
    }

    @Override
    public Collection<Job> searchWithName(String name) {

        Collection<Job> job = new ArrayList<>();

        for(Job jobs : jobDAO.job_list()){
            if(jobs.getJob_Name().contains(name)){
                job.add(jobs);
            }
        }

        return job;
    }

    @Override
    public Collection<Job> searchWithMinMoney(int money) {

        ArrayList<Job> job = new ArrayList<>();

        for(Job jobs : jobDAO.job_list()){
            if(jobs.getJob_Money() >= money){
                job.add(jobs);
            }
        }

        Collections.sort(job, new Comparator<Job>() {
            @Override
            public int compare(Job job1, Job job2) {
                if(job1.getJob_Money() <= job2.getJob_Money()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });

        return job;
    }

    @Override
    public Collection<Job> searchWithPlace(String place) {
        Collection<Job> job = new ArrayList<>();

        for(Job jobs : jobDAO.job_list()){
            if(jobs.getJob_Place().contains(place)){
                job.add(jobs);
            }
        }

        return job;
    }
}
