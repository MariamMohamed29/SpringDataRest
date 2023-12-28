package com.example.Employee.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EmployeeDto {
    private String firstName;
    private String lastName;

}
