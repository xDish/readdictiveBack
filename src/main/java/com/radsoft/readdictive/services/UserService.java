package com.radsoft.readdictive.services;

import com.radsoft.readdictive.entities.User;
import com.radsoft.readdictive.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User newUser){ userRepository.save(newUser); }

    public User getUserById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));}

    public List<User> getUsersByRole(String role){
        return userRepository.findByRole(role);
    }


}
