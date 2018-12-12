package hu.iit.me.converter;

import hu.iit.me.Exceptions.EmailFormatException;
import hu.iit.me.Exceptions.InvalidIDException;
import hu.iit.me.Exceptions.TooLowMoneyException;
import hu.iit.me.dto.JobDTOHR;
import hu.iit.me.model.Education;
import hu.iit.me.model.Job;
import hu.iit.me.model.Languages;

import java.util.ArrayList;
import java.util.Collection;

public class ConverterHR {

    public static Job unMarshallHR(JobDTOHR jobDTO) throws InvalidIDException, TooLowMoneyException, EmailFormatException {
        return new Job(jobDTO.getHRID(), jobDTO.getJobID(), jobDTO.getJobName(), jobDTO.getJobDescription(), Education.valueOf(jobDTO.getJobEduReq()), Languages.valueOf(jobDTO.getJobLangReq()), jobDTO.getJobPlace(), jobDTO.getJobMoney(), jobDTO.getContact());
    }


    public static JobDTOHR MarshallHR(Job job){
        JobDTOHR jobDTO = new JobDTOHR();

        jobDTO.setHRID(job.getHR_ID());
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

    public static Collection<JobDTOHR> MarchallListHR(Collection<Job> jobs){
        Collection<JobDTOHR> jobDTO = new ArrayList<>();

        for(Job job: jobs){
            jobDTO.add(MarshallHR(job));
        }

        return jobDTO;
    }


}
