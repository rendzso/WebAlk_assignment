package hu.iit.me.controller;

import hu.iit.me.model.Job;
import hu.iit.me.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;


@Controller
@RequestMapping(value = "/jobs")
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {this.jobService = jobService;}

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Job> listJobs(){return jobService.job_list();}

}
