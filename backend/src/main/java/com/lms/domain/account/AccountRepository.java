package com.lms.domain.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;
import java.util.Optional;
import com.lms.domain.user.User;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
    List<Account> findByUserOrderByNameAsc(User user);
    Optional<Account> findByIdAndUser(UUID id, User user);
}
