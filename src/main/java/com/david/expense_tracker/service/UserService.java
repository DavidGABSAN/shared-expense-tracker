package com.david.expense_tracker.service;

import com.david.expense_tracker.model.User;
import com.david.expense_tracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service //Lógica de negocio
public class UserService {

    private final UserRepository userRepository; // inyección de dependencias
        //Spring inyecta automáticamente el repository dentro del service
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}