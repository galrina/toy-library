package com.toyLibrary.toyLibraryService.repository;

import com.toyLibrary.toyLibraryService.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByEmail(String email);
}
