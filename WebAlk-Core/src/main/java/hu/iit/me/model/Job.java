package hu.iit.me.model;

public class Job {

    private int j_ID;
    private String j_name;
    private Education j_req_education;
    private int j_price;
    private String j_place;
    private String j_description;

    public Job(int j_ID, String j_name, Education j_req_education, int j_price, String j_place, String j_description) {
        this.j_ID = j_ID;
        this.j_name = j_name;
        this.j_req_education = j_req_education;
        this.j_price = j_price;
        this.j_place = j_place;
        this.j_description = j_description;
    }

    public int getJ_ID() {
        return j_ID;
    }

    public void setJ_ID(int j_ID) {
        this.j_ID = j_ID;
    }

    public String getJ_name() {
        return j_name;
    }

    public void setJ_name(String j_name) {
        this.j_name = j_name;
    }

    public Education getJ_req_education() {
        return j_req_education;
    }

    public void setJ_req_education(Education j_req_education) {
        this.j_req_education = j_req_education;
    }

    public int getJ_price() {
        return j_price;
    }

    public void setJ_price(int j_price) {
        this.j_price = j_price;
    }

    public String getJ_place() {
        return j_place;
    }

    public void setJ_place(String j_place) {
        this.j_place = j_place;
    }

    public String getJ_description() {
        return j_description;
    }

    public void setJ_description(String j_description) {
        this.j_description = j_description;
    }
}
