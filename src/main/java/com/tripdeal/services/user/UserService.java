package com.tripdeal.services.user;

import com.tripdeal.models.User;
import com.tripdeal.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public int save(User user) {
        if(user.getFirstName() == null && user.getLastName() == null){
            throw new IllegalArgumentException("You should initialise your FirstName and LastName ");
        }
        if(user.getEmail().isEmpty()){
            throw new IllegalArgumentException("Email not initialised");
        }
        if (!user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Error, your email address must contain @ symbol");
        }

        if (user.getPassword().length() <= 7) {
            throw new IllegalArgumentException("Your password must be 7 or more symbols long");
        }

        return userRepository.save(user);
    }

    @Override
    public int update(User user) {
        if (user.getPassword().length() <= 7) {
            throw new IllegalArgumentException("Your password must be 7 or more symbols long");
        }
        return userRepository.update(user);
    }

    @Override
    public int deleteById(int id) {
        return userRepository.deleteById(id);
    }

    @Override
    public List findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return userRepository.findById(id);
    }
}
