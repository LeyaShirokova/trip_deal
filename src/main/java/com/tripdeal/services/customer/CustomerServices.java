package com.tripdeal.services.customer;

import com.tripdeal.models.Customer;
import com.tripdeal.repository.customer.CustomerRepository;
import com.tripdeal.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices implements ICustomerServices {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public int save( Customer customer) {
        int id = userRepository.save(customer);
        return customerRepository.save(id,customer);
    }

    @Override
    public int update(Customer customer) {
        return customerRepository.update(customer);
    }

    @Override
    public int deleteById(int id) {
        return customerRepository.deleteById(id);
    }

    @Override
    public List findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return customerRepository.findById(id);
    }
}
