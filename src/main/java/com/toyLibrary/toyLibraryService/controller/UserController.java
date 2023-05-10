package com.toyLibrary.toyLibraryService.controller;

import com.toyLibrary.toyLibraryService.dto.request.LoginRequestDTO;
import com.toyLibrary.toyLibraryService.dto.request.RegistrationRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.LoginResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.dto.response.UserResponseDTO;
import com.toyLibrary.toyLibraryService.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UsersService usersService;

    @PostMapping("/login")
    public ResponseDTO<LoginResponseDTO> login(@RequestBody LoginRequestDTO req){
        return usersService.login(req);
    }

    @PostMapping("/register")
    public ResponseDTO<String> registerCustomer(@RequestBody RegistrationRequestDTO req){
        return usersService.registerCustomer(req);
    }
    @GetMapping("/addToCart/{userId}/{productId}")
    public ResponseDTO<UserResponseDTO> addToCart(@PathVariable("userId") Integer userId, @PathVariable("productId") Integer productId){
        return usersService.addToCart(userId, productId);
    }

    @DeleteMapping("/removeFromCart/{userId}/{productId}")
    ResponseDTO<UserResponseDTO> removeFromCart(@PathVariable("userId") Integer userId, @PathVariable("productId") Integer productId){
        return usersService.removeFromCart(userId, productId);
    }


}

