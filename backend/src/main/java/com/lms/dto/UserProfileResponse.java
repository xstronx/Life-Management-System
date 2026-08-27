package com.lms.dto;

import java.time.Instant;
import java.util.UUID;

public record UserProfileResponse(UUID id, String email, String fullName, Instant createdAt) {
}
