package hu.iit.me.dao;

import hu.iit.me.model.Applicant;
import hu.iit.me.model.Education;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class ApplicantDAOImpl implements ApplicantDAO {

    private Collection<Applicant> ApplicantData;

    public ApplicantDAOImpl() {
        ApplicantData = new ArrayList<>();

        ApplicantData.add(new Applicant(1,"Elsőke", 20, "Miskolc", Education.közép));
        ApplicantData.add(new Applicant(2, "Ketteske", 30, "Szeged", Education.egyetem));
        ApplicantData.add(new Applicant(3, "Hármaska", 45, "Budapest", Education.egyetem));
    }

    @Override
    public Collection<Applicant> applicant_list() {
        return ApplicantData;
    }
}