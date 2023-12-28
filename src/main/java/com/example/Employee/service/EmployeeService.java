package com.example.Employee.service;

import com.example.Employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    public EmployeeDto addEmployee(EmployeeDto employee);
    public EmployeeDto updateEmployee(EmployeeDto employeeDto,long id);
    public EmployeeDto deleteEmployeeById(Long id);
    public List<EmployeeDto> getAllEmployees();
    public EmployeeDto getEmployeeByID(long id);
}
