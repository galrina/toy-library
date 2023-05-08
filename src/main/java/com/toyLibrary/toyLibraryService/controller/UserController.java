package com.toyLibrary.toyLibraryService.controller;

import com.toyLibrary.toyLibraryService.dto.request.LoginRequestDTO;
import com.toyLibrary.toyLibraryService.dto.request.RegistrationRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UsersService usersService;

    @PostMapping("/login")
    public ResponseDTO<String> login(@RequestBody LoginRequestDTO req){
        return usersService.login(req);
    }

    @PostMapping("/register")
    public ResponseDTO<String> registerCustomer(@RequestBody RegistrationRequestDTO req){
        return usersService.registerCustomer(req);
    }

}

