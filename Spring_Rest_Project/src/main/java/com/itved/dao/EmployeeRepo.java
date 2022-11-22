package com.itved.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.itved.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
    List<Employee> findAll();
}
