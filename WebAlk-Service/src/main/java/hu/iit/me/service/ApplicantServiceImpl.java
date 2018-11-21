package hu.iit.me.service;


import hu.iit.me.dao.ApplicantDAO;
import hu.iit.me.model.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import hu.iit.me.service.ApplicantService;

import java.util.Collection;

public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantDAO applicantDAO;


    @Override
    public Collection<Applicant> applicant_list() {
        return applicantDAO.applicant_list();
    }
}
