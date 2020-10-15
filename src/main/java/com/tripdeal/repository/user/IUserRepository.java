package com.tripdeal.repository.user;

import com.tripdeal.models.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository  {
    int save(User user);

    int update(User user);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);
}
