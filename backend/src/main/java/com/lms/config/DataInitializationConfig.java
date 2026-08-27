package com.lms.config;

import com.lms.domain.account.Account;
import com.lms.domain.account.AccountRepository;
import com.lms.domain.account.AccountType;
import com.lms.domain.category.Category;
import com.lms.domain.category.CategoryRepository;
import com.lms.domain.category.CategoryType;
import com.lms.domain.user.User;
import com.lms.domain.user.UserRepository;
import com.lms.domain.user.UserRole;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.math.BigDecimal;

@Configuration
public class DataInitializationConfig {

    @Bean
    CommandLineRunner initData(
            UserRepository userRepository,
            AccountRepository accountRepository,
            CategoryRepository categoryRepository
    ) {
        return args -> {
            if (userRepository.count() == 0) {
                User user = new User();
                user.setEmail("demo@lms.com");
                user.setFullName("Usuario Demo");
                user.setPassword(new BCryptPasswordEncoder().encode("12345678"));
                userRepository.save(user);

                Account account = new Account("Cuenta principal", AccountType.BANK, new BigDecimal("1500.00"), user);
                accountRepository.save(account);

                Category income = new Category("Salario", CategoryType.INCOME, user);
                Category expense = new Category("Alimentación", CategoryType.EXPENSE, user);
                categoryRepository.save(income);
                categoryRepository.save(expense);
            }
            if (userRepository.findByEmail("admin@lms.com").isEmpty()) {
                User admin = new User("admin@lms.com", new BCryptPasswordEncoder().encode("Admin12345"), "Administrador LMS");
                admin.setRole(UserRole.ADMIN);
                userRepository.save(admin);
            }
        };
    }
}
