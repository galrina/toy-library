package com.toyLibrary.toyLibraryService.services;


import com.toyLibrary.toyLibraryService.dto.request.LoginRequestDTO;
import com.toyLibrary.toyLibraryService.dto.request.RegistrationRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import org.springframework.stereotype.Service;

public interface UsersService {
    ResponseDTO<String> login(LoginRequestDTO req);
    ResponseDTO<String> registerCustomer(RegistrationRequestDTO req);
}
