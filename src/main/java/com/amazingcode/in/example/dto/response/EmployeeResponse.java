package com.amazingcode.in.example.dto.response;

import com.amazingcode.in.example.dto.BaseDto;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse extends BaseDto {

    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String phone;
}
