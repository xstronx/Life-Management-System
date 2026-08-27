package com.lms.service;

import com.lms.domain.user.User;
import com.lms.domain.user.UserRepository;
import com.lms.dto.RegisterRequest;
import com.lms.dto.UpdateProfileRequest;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Locale;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public User register(RegisterRequest request) {
        String email = normalizeEmail(request.email());
        if (userRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("El email ya está registrado");
        }
        return userRepository.save(new User(email, passwordEncoder.encode(request.password()), request.fullName().trim()));
    }

    @Transactional(readOnly = true)
    public User findByEmail(String email) {
        return userRepository.findByEmail(normalizeEmail(email))
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));
    }

    @Transactional
    public User updateProfile(String email, UpdateProfileRequest request) {
        User user = findByEmail(email);
        user.setFullName(request.fullName().trim());
        user.setUpdatedAt(Instant.now());
        return userRepository.save(user);
    }

    public String normalizeEmail(String email) {
        return email.trim().toLowerCase(Locale.ROOT);
    }
}
