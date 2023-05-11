package com.toyLibrary.toyLibraryService.dto.response;

import com.toyLibrary.toyLibraryService.entity.Users;

import java.util.List;

public class UserResponseDTO {
    private int id;
    private String name;
    private String email;
    private String userType;
    private List<ProductResponseDTO> cart;

    public UserResponseDTO(Users user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.userType = user.getUserType().getName();
        this.cart = user.getCart().stream().map(ProductResponseDTO::new).toList();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<ProductResponseDTO> getCart() {
        return cart;
    }

    public void setCart(List<ProductResponseDTO> cart) {
        this.cart = cart;
    }
}
