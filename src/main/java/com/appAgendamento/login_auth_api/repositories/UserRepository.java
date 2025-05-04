package com.appAgendamento.login_auth_api.repositories;

import com.appAgendamento.login_auth_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
