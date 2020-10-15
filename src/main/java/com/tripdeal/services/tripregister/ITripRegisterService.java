package com.tripdeal.services.tripregister;

import com.tripdeal.models.TripRegister;

import java.util.List;
import java.util.Optional;

public interface ITripRegisterService {
    int save(TripRegister tripRegister);

    int update(TripRegister tripRegister);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);
}
