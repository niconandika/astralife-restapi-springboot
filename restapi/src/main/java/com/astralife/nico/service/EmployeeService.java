package com.astralife.nico.service;

import java.util.List;

import com.astralife.nico.model.Employee;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmployeeById(long employeeId);

    void deleteEmployee(long id);
}
