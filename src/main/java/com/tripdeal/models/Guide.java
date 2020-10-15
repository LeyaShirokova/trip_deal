package com.tripdeal.models;

public class Guide {
    private int guide_id;
    private String idCertificate;
    private String descriptionGuide;
    private int rate;

    public Guide(int guide_id, String idCertificate, String descriptionGuide, int rate) {
        this.guide_id = guide_id;
        this.idCertificate = idCertificate;
        this.descriptionGuide = descriptionGuide;
        this.rate = rate;
    }

    public int getGuide_id() {
        return guide_id;
    }

    public void setGuide_id(int guide_id) {
        this.guide_id = guide_id;
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
                "guide_id=" + guide_id +
                ", idCertificate='" + idCertificate + '\'' +
                ", descriptionGuide='" + descriptionGuide + '\'' +
                ", rate=" + rate +
                '}';
    }
}
