package com.tripdeal.services.user;

import com.tripdeal.models.User;
import com.tripdeal.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService  implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public int save(User user) {
     return userRepository.save(user);


    }

    @Override
    public int update(User user) {
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
