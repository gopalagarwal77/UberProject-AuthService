package com.example.UberProject_AuthService.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {

    private String id;

    private String email;

    private String password; // encrypted

    private String phoneNumber;

    private String name;

    private Date createdAt;


}
