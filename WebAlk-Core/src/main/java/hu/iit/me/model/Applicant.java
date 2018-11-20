package hu.iit.me.model;

public class Applicant {

    private int a_ID;
    private String a_name;
    private int a_age;
    private String a_livingplace;
    private Education a_education;


    public Applicant(int a_ID, String a_name, int a_age, String a_livingplace, Education a_education) {
        this.a_ID = a_ID;
        this.a_name = a_name;
        this.a_age = a_age;
        this.a_livingplace = a_livingplace;
        this.a_education = a_education;
    }

    public int getA_ID() {
        return a_ID;
    }

    public void setA_ID(int a_ID) {
        this.a_ID = a_ID;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public int getA_age() {
        return a_age;
    }

    public void setA_age(int a_age) {
        this.a_age = a_age;
    }

    public String getA_livingplace() {
        return a_livingplace;
    }

    public void setA_livingplace(String a_livingplace) {
        this.a_livingplace = a_livingplace;
    }

    public Education getA_education() {
        return a_education;
    }

    public void setA_education(Education a_education) {
        this.a_education = a_education;
    }
}
