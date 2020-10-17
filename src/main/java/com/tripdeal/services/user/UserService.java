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
        if (!user.getEmail().contains("@")) {
            System.out.println("Error, your email address must contain @ symbol");
            return 0;
        }
        if (user.getPassword().length() <= 6) {
            System.out.println("Your password must be 6 or more symbols long");
            return 0;
        }

        return userRepository.save(user);
    }

    @Override
    public int update(User user) {
        if (user.getPassword().length() <= 6) {
            System.out.println("Your password must be 6 or more symbols long");
            return 0;
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
