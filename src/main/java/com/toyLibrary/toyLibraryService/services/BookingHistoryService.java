package com.toyLibrary.toyLibraryService.services;

import com.toyLibrary.toyLibraryService.dto.response.BookingHistoryResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.entity.BookingHistory;

import java.util.List;

public interface BookingHistoryService {
    void saveBookingHistories(List<BookingHistory> list);
    ResponseDTO<List<BookingHistoryResponseDTO>> getBookingHistoryByProduct(Integer productId);
}
