package com.klasevich.itrex.docker.service;

import com.klasevich.itrex.docker.persistance.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(Employee employee);

    Employee find(long id);

    List<Employee> findAll();
}
