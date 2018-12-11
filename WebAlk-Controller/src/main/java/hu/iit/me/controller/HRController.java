package hu.iit.me.controller;

import hu.iit.me.converter.Converter;
import hu.iit.me.dto.JobDTO;
import hu.iit.me.model.Job;
import hu.iit.me.service.HRService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/HR")
public class HRController {

    private HRService hrService;

    public HRController(HRService hrService){
        this.hrService = hrService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void addJob(@RequestBody JobDTO newJob){hrService.addNewJob(Converter.unMarshall(newJob));}

}
