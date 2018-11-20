package hu.iit.me.dao;

import hu.iit.me.model.Education;
import hu.iit.me.model.Job;

import java.util.ArrayList;
import java.util.Collection;

public class JobDAOImpl implements JobDAO {

    private Collection<Job> JobData;

    public JobDAOImpl(Collection<Job> jobData) {
        JobData = new ArrayList<>();

        JobData.add(new Job(1,"Takarító", Education.általános, 60000, "Miskolc", "Épület takarítása."));
        JobData.add(new Job(2, "Tanító", Education.egyetem, 125000, "Eger", "1-4 osztályos diákok oktatása."));
    }

    @Override
    public Collection<Job> job_list() {
        return null;
    }
}
