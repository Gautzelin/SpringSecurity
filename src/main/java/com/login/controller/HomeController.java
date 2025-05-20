package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.login.service.UserService;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    Mostrar el formulario de registro
//    @GetMapping("/register")
//    public String showRegisterForm() {
//        return "register";  // Retorna la página de registro
//    }
//
//    @PostMapping("/register")
//    public String registerUser(String username, String password, Model model) {
//        try {
//            // Llamamos al servicio para registrar al usuario
//            userService.registerUser(username, password);
//            return "redirect:/login";  // Redirige al login después de registrar
//        } catch (Exception e) {
//            model.addAttribute("error", "Error al registrar el usuario.");
//            return "register";  // Si hay error, vuelve al formulario
//        }
//    }
}
