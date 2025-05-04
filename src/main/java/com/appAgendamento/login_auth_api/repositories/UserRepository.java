package com.appAgendamento.login_auth_api.repositories;

import com.appAgendamento.login_auth_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
