package com.amazingcode.in.example.service.impl;

import com.amazingcode.in.example.dto.request.EmployeeRequest;
import com.amazingcode.in.example.dto.response.EmployeeResponse;
import com.amazingcode.in.example.entity.Employee;
import com.amazingcode.in.example.repository.EmployeeRepository;
import com.amazingcode.in.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {

        Optional<Employee> checkEmployee = employeeRepository.findById(id);
        if (checkEmployee.isEmpty()){
            return null;
        }

        Employee existingEmployee = checkEmployee.get();
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setPhone(employee.getPhone());

        return employeeRepository.save(existingEmployee);
    }

    @Override
    public Employee getEmployee(Long id) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        return existingEmployee.orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        existingEmployee.ifPresent(employeeRepository::delete);
    }
}
