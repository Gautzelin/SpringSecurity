package com.login.service.impl;

import com.login.entity.UserEntity;
import com.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

//    @Override
//    public UserEntity findByUsername(String username) {
//        return userRepo.findByUsername(username).orElse(null);
//    }

//    @Override
//    public UserEntity save(UserEntity user) {
//        // Cifra la contraseña antes de guardar
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepo.save(user);
//    }
}
