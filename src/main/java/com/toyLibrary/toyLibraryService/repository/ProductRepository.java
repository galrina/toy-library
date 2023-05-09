package com.toyLibrary.toyLibraryService.repository;

import com.toyLibrary.toyLibraryService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}