package hu.iit.me.service;

import hu.iit.me.Exceptions.DataNotFoundException;
import hu.iit.me.Exceptions.SearchTagIsEmptyException;
import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobService {

    public Collection<Job> job_list() throws DataNotFoundException;

    public Collection<Job> searchWithName(String name) throws DataNotFoundException, SearchTagIsEmptyException;

    public Collection<Job> searchWithMinMoney(int money) throws DataNotFoundException;

    public Collection<Job> searchWithPlace(String place) throws DataNotFoundException;

    public Collection<Job> searchWithLanguage(String language) throws DataNotFoundException;

    public Collection<Job> searchWithEducation(String education) throws DataNotFoundException;



}
