package com.klasevich.itrex.docker.service.impl;

import com.klasevich.itrex.docker.exception.EmployeeNotFoundException;
import com.klasevich.itrex.docker.persistance.entity.Employee;
import com.klasevich.itrex.docker.persistance.repository.EmployeeRepository;
import com.klasevich.itrex.docker.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final String EMPLOYEE_EXCEPTION_MESSAGE = "Unable to find user with id: %d";
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee find(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(String.format(EMPLOYEE_EXCEPTION_MESSAGE, id)));
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
