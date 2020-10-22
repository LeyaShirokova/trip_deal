package com.tripdeal.services.tripregister;

import com.tripdeal.models.TripRegister;
import com.tripdeal.models.TripTypes;
import com.tripdeal.repository.tripregister.TripRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TripRegisterService implements ITripRegisterService {
    @Autowired
    TripRegisterRepository tripRegisterRepository;

    @Override
    public int save(TripRegister tripRegister) {
        if(tripRegister.getDateOfTrip().isBefore(LocalDate.now())){
            System.out.println("You cannot register a new trip if this date has already passed. Enter a future date");
            return 0;
        }
        if(tripRegister.getLevelOfDifficulty() > 5){
            throw new IllegalArgumentException("The difficulty of the trip is estimated from 1 to 5. Try add again");
        }
        if(tripRegister.getTripTypes()== null){
            throw new EnumConstantNotPresentException(TripTypes.class,"Type of trip can't be null, choose type");
        }
        return tripRegisterRepository.save(tripRegister);
    }

    @Override
    public int update(TripRegister tripRegister) {

        if(tripRegister.getDateOfTrip().isBefore(LocalDate.now())){
            System.out.println("You cannot register a new trip if this date has already passed. Enter a future date");
            return 0;
        }
        if(tripRegister.getLevelOfDifficulty() > 5){
            throw new IllegalArgumentException("The difficulty of the trip is estimated from 1 to 5. Try add again");
        }
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
