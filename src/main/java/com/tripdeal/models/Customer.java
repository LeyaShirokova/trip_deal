package com.tripdeal.models;

import java.time.LocalDate;
import java.util.Date;

public class Customer extends  User {
    private int customer_id;
    private Date dateOfBirth;

    public Customer(int customer_id, Date dateOfBirth) {
        this.customer_id = customer_id;
        this.dateOfBirth = dateOfBirth;
    }

    public Customer(int id, String firstName, String lastName, String email, String password, String city, String country, String phoneNum,  Date dateOfBirth) {
        super(id, firstName, lastName, email, password, city, country, phoneNum);

        this.dateOfBirth = dateOfBirth;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
