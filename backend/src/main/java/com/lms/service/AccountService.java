package com.lms.service;

import com.lms.domain.account.Account;
import com.lms.domain.account.AccountRepository;
import com.lms.domain.user.User;
import com.lms.dto.AccountRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    private final UserService userService;

    public AccountService(AccountRepository accountRepository, UserService userService) {
        this.accountRepository = accountRepository;
        this.userService = userService;
    }

    @Transactional(readOnly = true)
    public List<Account> findAll(String email) {
        return accountRepository.findByUserOrderByNameAsc(userService.findByEmail(email));
    }

    @Transactional
    public Account create(String email, AccountRequest request) {
        User user = userService.findByEmail(email);
        return accountRepository.save(new Account(request.name().trim(), request.type(), request.balance(), user));
    }

    @Transactional
    public Account update(String email, UUID id, AccountRequest request) {
        Account account = findOwned(email, id);
        account.setName(request.name().trim());
        account.setType(request.type());
        account.setBalance(request.balance());
        account.setDescription(request.description());
        if (request.active() != null) {
            account.setActive(request.active());
        }
        return accountRepository.save(account);
    }

    @Transactional
    public void delete(String email, UUID id) {
        accountRepository.delete(findOwned(email, id));
    }

    private Account findOwned(String email, UUID id) {
        return accountRepository.findByIdAndUser(id, userService.findByEmail(email))
                .orElseThrow(() -> new IllegalArgumentException("Cuenta no encontrada"));
    }
}
