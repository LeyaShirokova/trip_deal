package com.tripdeal.services.guide;

import com.tripdeal.models.Guide;

import java.util.List;
import java.util.Optional;

public interface IGuideService {
    int save(Guide guide);

    int update(Guide guide);

    int deleteById(int id);

    List findAll();

    Optional findById(Long id);
}
