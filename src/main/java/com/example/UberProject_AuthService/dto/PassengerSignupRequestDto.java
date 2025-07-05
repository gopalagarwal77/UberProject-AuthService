package com.example.UberProject_AuthService.dto;

import lombok.*;

@Getter    //  because dto object will come in the form of json our library serialization and deserialization will convert into java object
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerSignupRequestDto {

    private String email;

    private String password;

    private String phoneNumber;

    private String name;

}
