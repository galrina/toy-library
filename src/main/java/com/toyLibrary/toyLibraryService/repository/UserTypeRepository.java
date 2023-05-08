package com.toyLibrary.toyLibraryService.repository;

import com.toyLibrary.toyLibraryService.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {
    UserType findById(int id);
}

