package hu.iit.me.dao;

import hu.iit.me.Exceptions.InvalidIDException;
import hu.iit.me.Exceptions.TooLowMoneyException;
import hu.iit.me.model.Education;
import hu.iit.me.model.Job;
import hu.iit.me.model.Languages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class JobDAOImpl implements JobDAO {

    private Collection<Job> JobData;

    public JobDAOImpl() throws InvalidIDException, TooLowMoneyException {
        JobData = new ArrayList<>();

        JobData.add(new Job("Susan", 1, "OpenOffice Development Kukutyin Team", "Android application development based on java", Education.egyetem, Languages.java, "Miskolc", 160000, "alma@gmail.com"));
        JobData.add(new Job("Susan", 2, "Working on home!", "Working on future technologies", Education.egyetem, Languages.html, "Budapest", 300000, "alma@gmail.com"));
        JobData.add(new Job("Albert", 3, "Idontknowwhatitis", "Just do some tutorial application", Education.közép, Languages.python, "Eger", 120000, "bestjobs@gmail.com"));

    }

    @Override
    public Collection<Job> job_list() {
        return JobData;
    }



    @Override
    public void job_add(Job newjob) {

        JobData.add(newjob);

    }

}
