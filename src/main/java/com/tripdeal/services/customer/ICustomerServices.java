package com.tripdeal.services.customer;

import com.tripdeal.models.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerServices {
    int save( Customer customer);

    int update(Customer customer);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);
}
