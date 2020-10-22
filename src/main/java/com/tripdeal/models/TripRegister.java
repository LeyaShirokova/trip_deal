package com.tripdeal.models;
import java.time.LocalDate;


public class TripRegister extends MySuperId {
    private int trip_id;
    private String nameTrip;
    private LocalDate dateOfTrip;
    private int levelOfDifficulty;
    private TripTypes tripTypes;

    public TripRegister(int id, int trip_id, LocalDate dateOfTrip){
        super(id);
        this.trip_id = trip_id;
        this.dateOfTrip = dateOfTrip;
    }

    public TripRegister(int id, int trip_id, String nameTrip, LocalDate dateOfTrip, int levelOfDifficulty, TripTypes tripTypes) {
        super(id);
        this.trip_id = trip_id;
        this.nameTrip = nameTrip;
        this.dateOfTrip = dateOfTrip;
        this.levelOfDifficulty = levelOfDifficulty;
        this.tripTypes = tripTypes;
    }

    public TripTypes getTripTypes() {
        return tripTypes;
    }

    public void setTripTypes(TripTypes tripTypes) {
        this.tripTypes = tripTypes;
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

    public int getLevelOfDifficulty() {
        return levelOfDifficulty;
    }

    public void setLevelOfDifficulty(int levelOfDifficulty) {
        this.levelOfDifficulty = levelOfDifficulty;
    }

    @Override
    public String toString() {
        return "TripRegister{" +
                "trip_id=" + trip_id +
                ", nameTrip='" + nameTrip + '\'' +
                ", dateOfTrip=" + dateOfTrip +
                ", levelOfDifficulty=" + levelOfDifficulty +
                ", tripTypes=" + tripTypes +
                '}';
    }
}
