package com.url.shortner.repository;

import com.url.shortner.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface User_Repository extends JpaRepository<User,Long> {

Optional<User> findByEmail(String email);
Optional<User> findByUsername(String username);
boolean existsByEmail(String email);

}
