package com.tripdeal.services.user;

import com.tripdeal.models.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    int save(User user);

    int update(User user);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);
}
