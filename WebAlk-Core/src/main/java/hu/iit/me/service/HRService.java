package hu.iit.me.service;

import hu.iit.me.Exceptions.DataNotFoundException;
import hu.iit.me.Exceptions.JobIDAlreadyExistsException;
import hu.iit.me.Exceptions.JobIsExistsException;
import hu.iit.me.Exceptions.SearchTagIsEmptyException;
import hu.iit.me.model.Job;

import java.util.Collection;

public interface HRService {

    public void addNewJob(Job newJob) throws  JobIDAlreadyExistsException, JobIsExistsException;

    public Collection<Job> listByHR() throws DataNotFoundException;

    public Collection<Job> searchHR(String HR) throws DataNotFoundException, SearchTagIsEmptyException;

    public Job searchWithID(String IDS) throws DataNotFoundException, SearchTagIsEmptyException;

    public Collection<Job> listByHRWithDegreese(String HR) throws SearchTagIsEmptyException, DataNotFoundException;

}
