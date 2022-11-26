package com.example.flowerstore.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Integer> {

    public Optional<AppUser> findAppUserByEmail(String email);
}
