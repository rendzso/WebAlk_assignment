package hu.iit.me.converter;

import hu.iit.me.dto.JobDTOnonHR;
import hu.iit.me.model.Job;

import java.util.ArrayList;
import java.util.Collection;

public class ConverterNonHR {


    public static JobDTOnonHR MarshallNonHR(Job job){
        JobDTOnonHR jobDTO = new JobDTOnonHR();


        jobDTO.setJobID(job.getJob_ID());
        jobDTO.setJobName(job.getJob_Name());
        jobDTO.setJobDescription(job.getJob_Description());
        jobDTO.setJobEduReq(job.getJob_EduReq().toString());
        jobDTO.setJobLangReq(job.getJob_LangReq().toString());
        jobDTO.setJobPlace(job.getJob_Place());
        jobDTO.setJobMoney(job.getJob_Money());
        jobDTO.setContact(job.getContact());

        return jobDTO;

    }

    public static Collection<JobDTOnonHR> MarchallListNonHR(Collection<Job> jobs){
        Collection<JobDTOnonHR> jobDTO = new ArrayList<>();

        for(Job job: jobs){
            jobDTO.add(MarshallNonHR(job));
        }

        return jobDTO;
    }


}