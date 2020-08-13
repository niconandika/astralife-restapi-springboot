package com.astralife.nico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.astralife.nico.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
