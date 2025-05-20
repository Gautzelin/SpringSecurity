package com.login.service;
import com.login.entity.RolEntity;
import com.login.entity.UserEntity;
import com.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private RolService rolService;

    public void registerUser(String username, String password) {
        // Verificar si el usuario ya existe
        if (userRepository.existsByUsername(username)) {
            throw new RuntimeException("El usuario ya existe.");
        }

        // Crear nuevo objeto UserEntity
        UserEntity newUser = new UserEntity();
        newUser.setUsername(username);
        newUser.setPassword(passwordEncoder.encode(password));  // Cifrar la contraseña
        newUser.setEnabled(true);  // Usuario habilitado por defecto
        RolEntity userRol = rolService.getRolByName("USER")
                .orElseThrow(() -> new RuntimeException("El rol USER no existe en la base de datos"));

        newUser.setRol(userRol);

        // Guardar usuario en la base de datos
        userRepository.save(newUser);
    }
}
