package com.klasevich.itrex.docker.persistance.repository;

import com.klasevich.itrex.docker.persistance.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();
}
