package com.lms.controller;

import com.lms.domain.account.Account;
import com.lms.dto.AccountRequest;
import com.lms.dto.AccountResponse;
import com.lms.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountResponse> list(Authentication auth) {
        return accountService.findAll(auth.getName()).stream().map(this::toResponse).toList();
    }

    @PostMapping
    public AccountResponse create(Authentication auth, @Valid @RequestBody AccountRequest request) {
        return toResponse(accountService.create(auth.getName(), request));
    }

    @PutMapping("/{id}")
    public AccountResponse update(Authentication auth, @PathVariable UUID id, @Valid @RequestBody AccountRequest request) {
        return toResponse(accountService.update(auth.getName(), id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(Authentication auth, @PathVariable UUID id) {
        accountService.delete(auth.getName(), id);
        return ResponseEntity.noContent().build();
    }

    private AccountResponse toResponse(Account a) {
        return new AccountResponse(a.getId(), a.getName(), a.getType(), a.getBalance(), a.getDescription(), a.isActive());
    }
}
