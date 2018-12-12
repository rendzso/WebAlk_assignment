package hu.iit.me.controller;

import hu.iit.me.converter.ConverterNonHR;
import hu.iit.me.dto.JobDTOnonHR;
import hu.iit.me.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;


@Controller
@RequestMapping(value = "/jobs")
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {this.jobService = jobService;}

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTOnonHR> listJobs(){return ConverterNonHR.MarchallListNonHR(jobService.job_list());}

    @RequestMapping(value = "/searchWithName")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithName(@RequestParam(value = "name") String name){
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithName(name));
    }

    @RequestMapping(value = "/searchWithMinMoney")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithMinMoney(@RequestParam(value = "money") int money){
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithMinMoney(money));
    }

    @RequestMapping(value = "/searchWithPlace")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithPlace(@RequestParam(value = "place") String place){
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithPlace(place));
    }

}
