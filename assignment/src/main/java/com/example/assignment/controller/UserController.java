package com.example.assignment.controller;

import com.example.assignment.model.User;
import com.example.assignment.service.UserService;
import com.example.assignment.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addOrUpdateUser(user);
    }

    @PostMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.addOrUpdateUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/authenticate")
    public String createAuthenticationToken(@RequestBody User user) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
            );
        } catch (Exception e) {
            System.out.println("This is the error");
            throw new Exception("Incorrect username or password", e);
        }

        final User userDetails = userService.getUserByUsername(user.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails.getUsername());

        return jwt;
    }
}
