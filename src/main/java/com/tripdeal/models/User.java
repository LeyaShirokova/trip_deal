package com.tripdeal.models;

import com.tripdeal.MySuperId;

import javax.persistence.*;

public class User extends MySuperId {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String city;
    private String country;
    private String phoneNum;

    public User(int id, String firstName, String lastName, String email, String password, String city, String country, String phoneNum) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.city = city;
        this.country = country;
        this.phoneNum = phoneNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
