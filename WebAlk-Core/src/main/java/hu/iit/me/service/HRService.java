package hu.iit.me.service;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface HRService {

    public void addNewJob(Job newJob);

    public Collection<Job> listByHR();

    public Collection<Job> searchHR(String HR);

    public Job searchWithID(int ID);

    public Collection<Job> listByHRWithDegreese(String HR);

}
