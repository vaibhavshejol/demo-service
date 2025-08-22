package com.amazingcode.in.example.service;

import com.amazingcode.in.example.dto.request.EmployeeRequest;
import com.amazingcode.in.example.dto.response.EmployeeResponse;
import com.amazingcode.in.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee request);
    public Employee updateEmployee(Long id, Employee request);
    public Employee getEmployee(Long id);
    public List<Employee> getAllEmployees();
    public void deleteEmployee(Long id);
}
