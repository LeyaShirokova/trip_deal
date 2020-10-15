package com.tripdeal.repository.tripregister;

import com.tripdeal.models.TripRegister;
import com.tripdeal.models.User;

import java.util.List;
import java.util.Optional;

public interface ITripRegisterRepository {
    int save(TripRegister tripRegister);

    int update(TripRegister tripRegister);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);
}
