package com.toyLibrary.toyLibraryService.repository;

import com.toyLibrary.toyLibraryService.entity.BookingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingHistoryRepository extends JpaRepository<BookingHistory, Integer> {
    List<BookingHistory> findAllByProductId_Id(Integer id);
}

