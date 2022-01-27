package com.klasevich.itrex.docker.controller;

import com.klasevich.itrex.docker.persistance.entity.Employee;
import com.klasevich.itrex.docker.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/employees/")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("{id}")
    public Employee find(@PathVariable Long id) {
        return employeeService.find(id);
    }

    @GetMapping()
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @PostMapping()
    public Employee add(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }
}
