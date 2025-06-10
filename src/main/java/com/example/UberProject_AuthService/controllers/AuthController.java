package com.example.UberProject_AuthService.controllers;

import com.example.UberProject_AuthService.dto.PassengerDto;
import com.example.UberProject_AuthService.dto.PassengerSignupRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/signup/passenger")
    public ResponseEntity<PassengerDto> signup(@RequestBody PassengerSignupRequestDto passengerSignupRequestDto){



        return  null;
    }
}
