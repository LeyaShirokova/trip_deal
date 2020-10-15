package com.tripdeal.models;

public class Guide extends User{
    private int user_id;
    private String idCertificate;
    private String descriptionGuide;
    private int rate;


    public Guide(int user_id, String idCertificate, String descriptionGuide, int rate) {
        this.user_id = user_id;
        this.idCertificate = idCertificate;
        this.descriptionGuide = descriptionGuide;
        this.rate = rate;
    }

    public Guide(int id, String firstName, String lastName, String email, String password, String city, String country, String phoneNum, String idCertificate, String descriptionGuide, int rate) {
        super( id, firstName, lastName, email, password, city, country, phoneNum);
        this.idCertificate = idCertificate;
        this.descriptionGuide = descriptionGuide;
        this.rate = rate;
    }

    public String getIdCertificate() {
        return idCertificate;
    }

    public void setIdCertificate(String idCertificate) {
        this.idCertificate = idCertificate;
    }

    public String getDescriptionGuide() {
        return descriptionGuide;
    }

    public void setDescriptionGuide(String descriptionGuide) {
        this.descriptionGuide = descriptionGuide;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    @Override
    public String toString() {
        return "Guide{" +
                "user_id=" + user_id +
                ", idCertificate='" + idCertificate + '\'' +
                ", descriptionGuide='" + descriptionGuide + '\'' +
                ", rate=" + rate +
                '}';
    }
}
