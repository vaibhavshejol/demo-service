package com.amazingcode.in.example.dto.request;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String phone;
}
