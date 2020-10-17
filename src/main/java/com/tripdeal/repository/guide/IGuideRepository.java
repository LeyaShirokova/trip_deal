package com.tripdeal.repository.guide;

import com.tripdeal.models.Guide;
import com.tripdeal.models.User;

import java.util.List;
import java.util.Optional;

public interface IGuideRepository {
    int save(Guide guide);

    int update(Guide guide);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);

}
