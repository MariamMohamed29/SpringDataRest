package com.example.Employee.mapper;

import com.example.Employee.dto.EmployeeDto;
import com.example.Employee.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public EmployeeDto convertEmployeeToEmployeeDto(Employee employee){
        return EmployeeDto.builder()
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .build();
    }
    public Employee convertEmployeeDtoToEmployee(EmployeeDto employeeDto){
        return Employee.builder()
                .firstName(employeeDto.getFirstName())
                .lastName(employeeDto.getLastName())
                .build();
    }
    public Employee updateEmployeeFromEmployeeDto(EmployeeDto employeeDto,Employee employee){
        if (employeeDto == null)
            return employee;
        else {
            if (employeeDto.getFirstName() != null)
                employee.setFirstName(employeeDto.getFirstName());
            if (employeeDto.getLastName() != null)
                employee.setLastName(employeeDto.getLastName());
        }
        return employee;
    }
}
