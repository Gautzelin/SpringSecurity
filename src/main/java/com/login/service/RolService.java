package com.login.service;

import com.login.entity.RolEntity;
import com.login.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    public Optional<RolEntity> getRolByName(String rolName) {
        return rolRepository.findByName(rolName);
    }

    public RolEntity createRol(String rolName) {
        RolEntity rol = new RolEntity();
        rol.setName(rolName);
        return rolRepository.save(rol);
    }
}
