package com.tripdeal.models;

import com.tripdeal.MySuperId;

import java.time.LocalDate;
import java.util.Date;

public class TripRegister extends MySuperId {
    private int trip_id;
    private String nameTrip;
    private LocalDate dateOfTrip;
    private int levelOfTrip;


    public TripRegister(int id, int trip_id, String nameTrip, LocalDate dateOfTrip, int levelOfTrip) {
        super(id);
        this.trip_id = trip_id;
        this.nameTrip = nameTrip;
        this.dateOfTrip = dateOfTrip;
        this.levelOfTrip = levelOfTrip;
    }

    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public String getNameTrip() {
        return nameTrip;
    }

    public void setNameTrip(String nameTrip) {
        this.nameTrip = nameTrip;
    }

    public LocalDate getDateOfTrip() {
        return dateOfTrip;
    }

    public void setDateOfTrip(LocalDate dateOfTrip) {
        this.dateOfTrip = dateOfTrip;
    }

    public int getLevelOfTrip() {
        return levelOfTrip;
    }

    public void setLevelOfTrip(int levelOfTrip) {
        this.levelOfTrip = levelOfTrip;
    }

    @Override
    public String toString() {
        return "TripRegister{" +
                "trip_id=" + trip_id +
                ", nameTrip='" + nameTrip + '\'' +
                ", dateOfTrip=" + dateOfTrip +
                ", levelOfTrip=" + levelOfTrip +
                '}';
    }
}
