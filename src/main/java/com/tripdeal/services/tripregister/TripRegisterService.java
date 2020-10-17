package com.tripdeal.services.tripregister;

import com.tripdeal.models.TripRegister;
import com.tripdeal.repository.tripregister.TripRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripRegisterService implements ITripRegisterService {
    @Autowired
    TripRegisterRepository tripRegisterRepository;

    @Override
    public int save(TripRegister tripRegister) {
        return tripRegisterRepository.save(tripRegister);
    }

    @Override
    public int update(TripRegister tripRegister) {
        return tripRegisterRepository.update(tripRegister);
    }

    @Override
    public int deleteById(int id) {
        return tripRegisterRepository.deleteById(id);
    }

    @Override
    public List findAll() {
        return tripRegisterRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return tripRegisterRepository.findById(id);
    }
}
