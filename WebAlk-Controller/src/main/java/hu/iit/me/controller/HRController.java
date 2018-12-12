package hu.iit.me.controller;

import hu.iit.me.Exceptions.*;
import hu.iit.me.converter.ConverterHR;
import hu.iit.me.dto.JobDTOHR;
import hu.iit.me.service.HRService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@Controller
@RequestMapping(value = "/HR")
public class HRController {

    private HRService hrService;

    public HRController(HRService hrService){
        this.hrService = hrService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Collection<JobDTOHR> addJob(@RequestBody JobDTOHR newJob) throws InvalidIDException, TooLowMoneyException, JobIDAlreadyExistsException, JobIsExistsException, DataNotFoundException, EmailFormatException { hrService.addNewJob(ConverterHR.unMarshallHR(newJob));
    return ConverterHR.MarchallListHR(hrService.listByHR());
    }

    @RequestMapping(value = "/listByABC", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTOHR> listJobs() throws DataNotFoundException{return ConverterHR.MarchallListHR(hrService.listByHR());
    }

    @RequestMapping(value = "/searchHR", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTOHR> searchHR(@RequestParam(value = "HR") String HR) throws DataNotFoundException, SearchTagIsEmptyException{
        return ConverterHR.MarchallListHR(hrService.searchHR(HR));
    }

    @RequestMapping(value = "/searchWithID", method = RequestMethod.GET)
    @ResponseBody
    public JobDTOHR searchWithID(@RequestParam(value = "ID") String ID) throws DataNotFoundException, SearchTagIsEmptyException{
        return ConverterHR.MarshallHR(hrService.searchWithID(ID));
    }

    @RequestMapping(value = "/listByHRWithDegreese", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobDTOHR> listByHRWithDegreese(@RequestParam(value = "HR") String HR) throws DataNotFoundException, SearchTagIsEmptyException{
        return ConverterHR.MarchallListHR(hrService.listByHRWithDegreese(HR));
    }

}
