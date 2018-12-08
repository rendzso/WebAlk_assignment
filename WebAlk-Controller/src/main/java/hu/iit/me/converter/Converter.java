package hu.iit.me.converter;

import hu.iit.me.dto.JobDTO;
import hu.iit.me.model.Education;
import hu.iit.me.model.Job;
import hu.iit.me.model.Languages;

import java.util.ArrayList;
import java.util.Collection;

public class Converter {

    public static Job unMarshall(JobDTO jobDTO){
        return new Job(jobDTO.getHRID(), jobDTO.getJobID(), jobDTO.getJobName(), jobDTO.getJobDescription(), Education.valueOf(jobDTO.getJobEduReq()), Languages.valueOf(jobDTO.getJobLangReq()), jobDTO.getJobPlace(), jobDTO.getJobMoney());
    }


    public static JobDTO Marshall(Job job){
        JobDTO jobDTO = new JobDTO();

        jobDTO.setHRID(job.getHR_ID());
        jobDTO.setJobID(job.getJob_ID());
        jobDTO.setJobName(job.getJob_Name());
        jobDTO.setJobDescription(job.getJob_Description());
        jobDTO.setJobEduReq(job.getJob_EduReq().toString());
        jobDTO.setJobLangReq(job.getJob_LangReq().toString());
        jobDTO.setJobPlace(job.getJob_Place());
        jobDTO.setJobMoney(job.getJob_Money());

        return jobDTO;

    }

    public static Collection<JobDTO> MarchallList(Collection<Job> jobs){
        Collection<JobDTO> jobDTO = new ArrayList<>();

        for(Job job: jobs){
            jobDTO.add(Marshall(job));
        }

        return jobDTO;
    }


}
