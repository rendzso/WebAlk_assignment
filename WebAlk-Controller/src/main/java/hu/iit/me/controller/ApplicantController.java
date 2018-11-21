package hu.iit.me.controller;

import hu.iit.me.model.Applicant;
import hu.iit.me.service.ApplicantService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.Collection;

@Controller
@RequestMapping(value = "/applicant")
public class ApplicantController {

    private ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Applicant> listApplicants() {
        return applicantService.applicant_list();
    }

}
