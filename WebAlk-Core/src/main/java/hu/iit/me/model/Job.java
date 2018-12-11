package hu.iit.me.model;

public class Job {

    private String HR_ID;
    private int job_ID;
    private String job_Name;
    private String job_Description;
    private Education job_EduReq;
    private Languages job_LangReq;
    private String job_Place;
    private int job_Money;
    private String contact;

    public Job(String HR_ID, int job_ID, String job_Name, String job_Description, Education job_EduReq, Languages job_LangReq, String job_Place, int job_Money, String contact) {
        this.HR_ID = HR_ID;
        this.job_ID = job_ID;
        this.job_Name = job_Name;
        this.job_Description = job_Description;
        this.job_EduReq = job_EduReq;
        this.job_LangReq = job_LangReq;
        this.job_Place = job_Place;
        this.job_Money = job_Money;
        this.contact = contact;
    }

    public String getHR_ID() {
        return HR_ID;
    }

    public void setHR_ID(String HR_ID) {
        this.HR_ID = HR_ID;
    }

    public int getJob_ID() {
        return job_ID;
    }

    public void setJob_ID(int job_ID) {
        this.job_ID = job_ID;
    }

    public String getJob_Name() {
        return job_Name;
    }

    public void setJob_Name(String job_Name) {
        this.job_Name = job_Name;
    }

    public String getJob_Description() {
        return job_Description;
    }

    public void setJob_Description(String job_Description) {
        this.job_Description = job_Description;
    }

    public Education getJob_EduReq() {
        return job_EduReq;
    }

    public void setJob_EduReq(Education job_EduReq) {
        this.job_EduReq = job_EduReq;
    }

    public Languages getJob_LangReq() {
        return job_LangReq;
    }

    public void setJob_LangReq(Languages job_LangReq) {
        this.job_LangReq = job_LangReq;
    }

    public String getJob_Place() {
        return job_Place;
    }

    public void setJob_Place(String job_Place) {
        this.job_Place = job_Place;
    }

    public int getJob_Money() {
        return job_Money;
    }

    public void setJob_Money(int job_Money) {
        this.job_Money = job_Money;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
