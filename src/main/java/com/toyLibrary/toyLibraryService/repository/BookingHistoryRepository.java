package com.toyLibrary.toyLibraryService.repository;

import com.toyLibrary.toyLibraryService.entity.BookingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingHistoryRepository extends JpaRepository<BookingHistory, Integer> {
}
