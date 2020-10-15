package com.tripdeal.repository.customer;

import com.tripdeal.models.Customer;
import com.tripdeal.models.Guide;

import java.util.List;
import java.util.Optional;

public interface ICustomerRepository {
    int save(int id, Customer customer);

    int update(Customer customer);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);
}
