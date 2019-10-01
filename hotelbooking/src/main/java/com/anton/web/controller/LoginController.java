package com.anton.web.controller;

import com.anton.dao.entity.Role;
import com.anton.dao.entity.User;
import com.anton.dao.repository.RoleRepository;
import com.anton.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/registration")
    public String registrationPage() {
        return "registration";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping("/admin/page")
    public String adminPage() {
        return "admin-page";
    }

    @GetMapping("/user/page")
    public String userPage() {
        return "user-page";
    }

    @PostMapping("/registration")
    public String registration(User user) {
        Role userRole = roleRepository.findByName("USER");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(userRole);
        userRepository.save(user);
        return "redirect:login";
    }
}
