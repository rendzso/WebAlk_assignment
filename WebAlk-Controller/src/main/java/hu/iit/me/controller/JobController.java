package hu.iit.me.controller;

import hu.iit.me.Exceptions.DataNotFoundException;
import hu.iit.me.Exceptions.SearchTagIsEmptyException;
import hu.iit.me.Exceptions.TooLowMoneyException;
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
    public Collection<JobDTOnonHR> listJobs() throws DataNotFoundException {return ConverterNonHR.MarchallListNonHR(jobService.job_list());}

    @RequestMapping(value = "/searchWithName")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithName(@RequestParam(value = "name") String name) throws DataNotFoundException, SearchTagIsEmptyException {
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithName(name));
    }

    @RequestMapping(value = "/searchWithMinMoney")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithMinMoney(@RequestParam(value = "money") String money) throws DataNotFoundException, SearchTagIsEmptyException, TooLowMoneyException {
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithMinMoney(money));
    }

    @RequestMapping(value = "/searchWithPlace")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithPlace(@RequestParam(value = "place") String place) throws DataNotFoundException, SearchTagIsEmptyException{
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithPlace(place));
    }

    @RequestMapping(value = "/searchWithLanguage")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithLanguage(@RequestParam(value = "language") String language) throws DataNotFoundException, SearchTagIsEmptyException {
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithLanguage(language));
    }

    @RequestMapping(value = "/searchWithEducation")
    @ResponseBody
    public Collection<JobDTOnonHR> searchWithEducation(@RequestParam(value = "education") String education) throws DataNotFoundException, SearchTagIsEmptyException{
        return ConverterNonHR.MarchallListNonHR(jobService.searchWithEducation(education));
    }

}
