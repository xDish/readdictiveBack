package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.User;
import com.radsoft.readdictive.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createUser(User newUser){ userRepository.save(newUser); }

    public User getUserById(Long id){
        return userRepository.findById(id).get();
    }
}
