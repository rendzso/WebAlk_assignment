package hu.iit.me.service;

import hu.iit.me.Exceptions.DataNotFoundException;
import hu.iit.me.Exceptions.JobIDAlreadyExistsException;
import hu.iit.me.Exceptions.JobIsExistsException;
import hu.iit.me.Exceptions.SearchTagIsEmptyException;
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
    public void addNewJob(Job newJob) throws JobIDAlreadyExistsException, JobIsExistsException {


        for(Job j : jobDAO.job_list()){
            if(j.getJob_ID() == newJob.getJob_ID()){
                throw new JobIDAlreadyExistsException();
            }
            if(j.getJob_Name().equals(newJob.getJob_Name())){
                throw new JobIsExistsException();
            }
        }

        jobDAO.job_add(newJob);
    }

    @Override
    public Collection<Job> listByHR() throws DataNotFoundException {
        ArrayList<Job> job = new ArrayList(jobDAO.job_list());

        Collections.sort(job, new Comparator<Job>() {
            @Override
            public int compare(Job job1, Job job2) {
               return job1.getHR_ID().compareToIgnoreCase(job2.getHR_ID());
            }
        });

        if(job.isEmpty()){
            throw new DataNotFoundException();
        }
        else{
            return job;
        }
    }


    @Override
    public Collection<Job> searchHR(String HR) throws DataNotFoundException, SearchTagIsEmptyException {

        if(HR.isEmpty()){
            throw new SearchTagIsEmptyException();
        }

        Collection<Job> job = new ArrayList<>();

        for(Job jobs : jobDAO.job_list()){
            if(jobs.getHR_ID().equals(HR)){
                job.add(jobs);
            }
        }

        if(job.isEmpty()){
            throw new DataNotFoundException();
        }
        else{
            return job;
        }

    }

    @Override
    public Job searchWithID(String IDS) throws DataNotFoundException, SearchTagIsEmptyException {

        if(IDS.isEmpty()){
            throw new SearchTagIsEmptyException();
        }

        int ID = Integer.parseInt(IDS);

        for(Job jobs : jobDAO.job_list()){
            if(jobs.getJob_ID() == ID){
                return jobs;
            }
        }

        throw new DataNotFoundException();

    }

    @Override
    public Collection<Job> listByHRWithDegreese(String HR) throws SearchTagIsEmptyException, DataNotFoundException {

        if(HR.isEmpty()){
            throw new SearchTagIsEmptyException();
        }

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

        if(job.isEmpty()){
            throw new DataNotFoundException();
        }
        else{
            return job;
        }
    }
}
