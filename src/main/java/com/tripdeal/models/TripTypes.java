package com.tripdeal.models;

public enum TripTypes {
    TREKKING(1), RAFTING(2), MOUNTAINS(3), HISTORICAL(4), DIVING(5);
    private int value;

    TripTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
