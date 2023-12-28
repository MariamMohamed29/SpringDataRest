package com.example.Employee.service;

import com.example.Employee.dto.EmployeeDto;
import com.example.Employee.entity.Employee;
import com.example.Employee.mapper.Mapper;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImp implements EmployeeService{
    private Mapper mapper;
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImp(Mapper mapper, EmployeeRepository employeeRepository) {
        this.mapper = mapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto addEmployee(EmployeeDto employee) {
        Employee savedData=mapper.convertEmployeeDtoToEmployee(employee);
        Employee savedEmployee=employeeRepository.save(savedData);
        return mapper.convertEmployeeToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto, long id) {
        Optional<Employee> employee=employeeRepository.findById(id);
        Employee employee1=mapper.updateEmployeeFromEmployeeDto(employeeDto,employee.get());
        employeeRepository.save(employee1);
        return mapper.convertEmployeeToEmployeeDto(employee1);
    }

    @Override
    public EmployeeDto deleteEmployeeById(Long id) {
        Employee employee=employeeRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("there is no employee with this id")
        );
        employeeRepository.delete(employee);
        return mapper.convertEmployeeToEmployeeDto(employee);
}

    @Override
    public List<EmployeeDto> getAllEmployees() {
      List<EmployeeDto> employees=employeeRepository.findAll().stream()
              .map(employee -> mapper.convertEmployeeToEmployeeDto(employee))
              .collect(Collectors.toList());
      return employees;
    }

    @Override
    public EmployeeDto getEmployeeByID(long id) {
        Employee employee=employeeRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("there is no employee with this id")
        );
        return mapper.convertEmployeeToEmployeeDto(employee);
    }
}
