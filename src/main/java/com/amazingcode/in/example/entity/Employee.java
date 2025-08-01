package com.amazingcode.in.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private String department;

    private String phone;
}
