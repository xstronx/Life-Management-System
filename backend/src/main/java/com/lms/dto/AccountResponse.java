package com.lms.dto;

import com.lms.domain.account.AccountType;
import java.math.BigDecimal;
import java.util.UUID;

public record AccountResponse(UUID id, String name, AccountType type, BigDecimal balance, String description, boolean active) {}
