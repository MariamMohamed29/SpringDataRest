package com.example.Employee.controller;

import com.example.Employee.dto.EmployeeDto;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/newEmployee")
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDto employee){
        var response =service.addEmployee(employee);
        return ResponseEntity.ok(response);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(@RequestBody EmployeeDto employee, @PathVariable long id){
        var response=service.updateEmployee(employee,id);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable long id){
        var response=service.deleteEmployeeById(id);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/AllEmployees")
    public ResponseEntity<?> getAll(){
        var response=service.getAllEmployees();
        return ResponseEntity.ok(response);
    }
    @GetMapping("{id}")
    private ResponseEntity<?> getEmployeeByID(@PathVariable long id){
        var response=service.getEmployeeByID(id);
        return ResponseEntity.ok(response);
    }

}
