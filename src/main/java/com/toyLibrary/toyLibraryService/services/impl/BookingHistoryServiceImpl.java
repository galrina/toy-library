package com.toyLibrary.toyLibraryService.services.impl;

import com.toyLibrary.toyLibraryService.dto.response.BookingHistoryResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.entity.BookingHistory;
import com.toyLibrary.toyLibraryService.repository.BookingHistoryRepository;
import com.toyLibrary.toyLibraryService.services.BookingHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingHistoryServiceImpl {

    @Autowired
    BookingHistoryRepository bookingHistoryRepository;

    public void saveBookingHistories(List<BookingHistory> list){
        bookingHistoryRepository.saveAll(list);
    }

    public ResponseDTO<List<BookingHistoryResponseDTO>> getBookingHistoryByProduct(Integer productId){
        List<BookingHistory> bhs = bookingHistoryRepository.findAllByProductId_Id(productId);
        List<BookingHistoryResponseDTO> responseDTOs = bhs.stream().map(BookingHistoryResponseDTO::new).toList();
        return new ResponseDTO<>(responseDTOs, HttpStatus.OK.value(), "Successfully fetched Booking History!");
    }
}
