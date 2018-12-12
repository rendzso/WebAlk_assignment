package hu.iit.me.service;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobService {

    public Collection<Job> job_list();

    public Collection<Job> searchWithName(String name);

    public Collection<Job> searchWithMinMoney(int money);

    public Collection<Job> searchWithPlace(String place);

    public Collection<Job> searchWithLanguage(String language);

    public Collection<Job> searchWithEducation(String education);



}
