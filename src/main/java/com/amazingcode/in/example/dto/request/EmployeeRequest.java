package com.amazingcode.in.example.dto.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String phone;
}
