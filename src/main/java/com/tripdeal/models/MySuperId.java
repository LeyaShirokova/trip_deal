package com.tripdeal.models;

public class MySuperId {
    protected int id;

    public MySuperId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MySuperId{" +
                "id=" + id +
                '}';
    }
}
