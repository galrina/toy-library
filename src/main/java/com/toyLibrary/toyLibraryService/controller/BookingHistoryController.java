package com.toyLibrary.toyLibraryService.controller;

import com.toyLibrary.toyLibraryService.dto.response.BookingHistoryResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.services.BookingHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BookingHistory")
@CrossOrigin(origins = "http://localhost:3000")
public class BookingHistoryController {

    @Autowired
    BookingHistoryService bookingHistoryService;
    @GetMapping("/{productId}")
    public ResponseDTO<List<BookingHistoryResponseDTO>> getBookingHistoryByProduct(@PathVariable("productId") Integer productId){
        return bookingHistoryService.getBookingHistoryByProduct(productId);
    }
}
