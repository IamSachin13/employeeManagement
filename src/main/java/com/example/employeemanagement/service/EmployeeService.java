package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);

    Employee getEmployeeById(String id);

    void deleteEmployeeById(String id);
}
