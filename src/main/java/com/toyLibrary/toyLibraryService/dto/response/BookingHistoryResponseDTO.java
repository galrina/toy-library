package com.toyLibrary.toyLibraryService.dto.response;

import com.toyLibrary.toyLibraryService.entity.BookingHistory;

import java.sql.Date;

public class BookingHistoryResponseDTO {
    private Integer id;
    private UserResponseDTO user;
    private ProductResponseDTO product;
    private Date bookedFrom;
    private Date bookedUntil;

    public BookingHistoryResponseDTO(BookingHistory bh) {
        this.id = bh.getId();
        this.user = new UserResponseDTO(bh.getUserId());
        this.product = new ProductResponseDTO(bh.getProductId());
        this.bookedFrom = bh.getBookedFrom();
        this.bookedUntil = bh.getBookedUntil();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserResponseDTO getUser() {
        return user;
    }

    public void setUser(UserResponseDTO user) {
        this.user = user;
    }

    public ProductResponseDTO getProduct() {
        return product;
    }

    public void setProduct(ProductResponseDTO product) {
        this.product = product;
    }

    public Date getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(Date bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public Date getBookedUntil() {
        return bookedUntil;
    }

    public void setBookedUntil(Date bookedUntil) {
        this.bookedUntil = bookedUntil;
    }
}
