package com.toyLibrary.toyLibraryService.dto.response;

import com.toyLibrary.toyLibraryService.entity.Users;

public class LoginResponseDTO {
    private String token;
    private UserResponseDTO userDetails;

    public LoginResponseDTO(String token, Users u) {
        this.token = token;
        this.userDetails = new UserResponseDTO(u);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserResponseDTO getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserResponseDTO userDetails) {
        this.userDetails = userDetails;
    }
}
