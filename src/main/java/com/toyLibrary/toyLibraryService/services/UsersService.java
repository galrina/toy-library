package com.toyLibrary.toyLibraryService.services;


import com.toyLibrary.toyLibraryService.dto.request.LoginRequestDTO;
import com.toyLibrary.toyLibraryService.dto.request.RegistrationRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.LoginResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.UserResponseDTO;
import org.springframework.stereotype.Service;

public interface UsersService {
    ResponseDTO<LoginResponseDTO> login(LoginRequestDTO req);
    ResponseDTO<String> registerCustomer(RegistrationRequestDTO req);
    ResponseDTO<UserResponseDTO> addToCart(Integer userId, Integer productId);
    ResponseDTO<UserResponseDTO> removeFromCart(Integer userId, Integer productId);
}
