package hu.iit.me.model;

import hu.iit.me.Exceptions.EmailFormatException;
import hu.iit.me.Exceptions.InvalidIDException;
import hu.iit.me.Exceptions.TooLowMoneyException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Job {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private String HR_ID;
    private int job_ID;
    private String job_Name;
    private String job_Description;
    private Education job_EduReq;
    private Languages job_LangReq;
    private String job_Place;
    private int job_Money;
    private String contact;

    public Job(String HR_ID, int job_ID, String job_Name, String job_Description, Education job_EduReq, Languages job_LangReq, String job_Place, int job_Money, String contact) throws InvalidIDException, TooLowMoneyException, EmailFormatException {
        this.HR_ID = HR_ID;
        if(job_ID > 0) {
            this.job_ID = job_ID;
        }
        else{
            throw new InvalidIDException();
        }
        this.job_Name = job_Name;
        this.job_Description = job_Description;
        this.job_EduReq = job_EduReq;
        this.job_LangReq = job_LangReq;
        this.job_Place = job_Place;
        if(job_Money > 78000) {
            this.job_Money = job_Money;
        }
        else{
            throw new TooLowMoneyException();
        }
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(contact);
        if(matcher.find()){
            this.contact = contact;
        } else{
            throw new EmailFormatException();
        }

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

    public void setJob_ID(int job_ID) throws InvalidIDException {
        if(job_ID > 0) {
            this.job_ID = job_ID;
        }
        else{
            throw new InvalidIDException();
        }
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

    public void setJob_Money(int job_Money) throws TooLowMoneyException {
        if(job_Money > 78000) {
            this.job_Money = job_Money;
        }
        else{
            throw new TooLowMoneyException();
        }
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) throws EmailFormatException {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(contact);
        if(matcher.find()){
            this.contact = contact;
        } else{
            throw new EmailFormatException();
        }
    }
}
