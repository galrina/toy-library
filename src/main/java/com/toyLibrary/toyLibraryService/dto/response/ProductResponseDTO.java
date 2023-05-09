package com.toyLibrary.toyLibraryService.dto.response;

import com.toyLibrary.toyLibraryService.entity.Product;
import com.toyLibrary.toyLibraryService.entity.Users;
import java.sql.Date;
import java.util.Objects;

public class ProductResponseDTO {
    private int id;
    private String name;
    private UserResponseDTO bookedBy;
    private Date bookedUntil;

    public ProductResponseDTO(Product p) {
        this.id = p.getId();
        this.name = p.getName();
        this.bookedBy = Objects.nonNull(p.getBookedBy()) ? new UserResponseDTO(p.getBookedBy()) : null;
        this.bookedUntil = p.getBookedUntil();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserResponseDTO getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(UserResponseDTO bookedBy) {
        this.bookedBy = bookedBy;
    }

    public Date getBookedUntil() {
        return bookedUntil;
    }

    public void setBookedUntil(Date bookedUntil) {
        this.bookedUntil = bookedUntil;
    }
}
