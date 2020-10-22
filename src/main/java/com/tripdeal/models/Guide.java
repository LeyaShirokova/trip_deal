package com.tripdeal.models;

public class Guide extends MySuperId {
    private String idCertificate;
    private String descriptionGuide;
    private int rate;

    public Guide(int id, String idCertificate, String descriptionGuide, int rate) {
        super(id);
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

    @Override
    public String toString() {
        return "Guide{" +
                "idCertificate='" + idCertificate + '\'' +
                ", descriptionGuide='" + descriptionGuide + '\'' +
                ", rate=" + rate +
                '}';
    }
}
