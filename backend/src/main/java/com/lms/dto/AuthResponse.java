package com.lms.dto;

public record AuthResponse(String email, String fullName, String role, String token) {
}
