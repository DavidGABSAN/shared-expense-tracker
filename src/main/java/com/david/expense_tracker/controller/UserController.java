package com.david.expense_tracker.controller;

import com.david.expense_tracker.model.User;
import com.david.expense_tracker.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService; // Inyección de dependencias

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping // Se registra un usuario
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

}