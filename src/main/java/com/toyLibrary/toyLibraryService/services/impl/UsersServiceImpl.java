package com.toyLibrary.toyLibraryService.services.impl;

import com.toyLibrary.toyLibraryService.constants.UserTypes;
import com.toyLibrary.toyLibraryService.dto.request.LoginRequestDTO;
import com.toyLibrary.toyLibraryService.dto.request.RegistrationRequestDTO;
import com.toyLibrary.toyLibraryService.dto.response.ResponseDTO;
import com.toyLibrary.toyLibraryService.entity.UserType;
import com.toyLibrary.toyLibraryService.entity.Users;
import com.toyLibrary.toyLibraryService.repository.UserTypeRepository;
import com.toyLibrary.toyLibraryService.repository.UsersRepository;
import com.toyLibrary.toyLibraryService.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
import java.util.Random;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    UserTypeRepository userTypeRepository;

    public ResponseDTO<String> login(LoginRequestDTO req){
        Optional<Users> optionalUser = usersRepository.findByEmail(req.getEmail());
        // First check if user exists with given email
        if(optionalUser.isEmpty()){
            // User does not exist with given email
            System.out.println("User was not found! Returning Error!");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Incorrect Email/Password Combination");
        }
        // User does exist with given email, now check if the password inputted is correct
        Users user = optionalUser.get();
        if(!user.getPassword().equals(req.getPassword())){
            // Inputted password is incorrect!
            System.out.println("Incorrect password inputted! Returning Error!");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Incorrect Email/Password Combination");
        }
        // All checks passed! User exists so now need to return a token
        System.out.println("Details provided verified! Logging in...");
        return new ResponseDTO<>(generateRandomAlphaNumericString(), HttpStatus.OK.value(), "Logged in Successfully!");
    }

    public ResponseDTO<String> registerCustomer(RegistrationRequestDTO req){
        // First check if user already exists with given email
        Optional<Users> optionalUser = usersRepository.findByEmail(req.getEmail());
        if(optionalUser.isPresent()){
            // User already exists!
            System.out.println("User already exists with provided email!");
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User already exists!");
        }
        Users newUser = new Users();

        UserType customerType = userTypeRepository.findById(UserTypes.CUSTOMER);

        newUser.setEmail(req.getEmail());
        newUser.setName(req.getName());
        newUser.setPassword(req.getPassword());
        newUser.setUserType(customerType);

        usersRepository.save(newUser);

        return new ResponseDTO<>(HttpStatus.OK.value(), "User Creation Successful! Please login now!");
    }


    /**
     * This code was copied off of https://www.baeldung.com/java-random-string to generate a random string to act as a
     * token for login response
     * @return random alphanumeric string
     */
    private String generateRandomAlphaNumericString(){
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
