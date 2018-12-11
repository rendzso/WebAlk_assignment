package hu.iit.me.service;

import hu.iit.me.dao.JobDAO;
import hu.iit.me.model.Job;
import org.springframework.beans.factory.annotation.Autowired;

public class HRServiceImpl implements HRService{

    @Autowired
    private JobDAO jobDAO;

    @Override
    public void addNewJob(Job newJob) {
        jobDAO.job_add(newJob);
    }
}
