package com.astralife.nico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.astralife.nico.exception.ResourceNotFoundException;
import com.astralife.nico.model.Employee;
import com.astralife.nico.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee){ return employeeRepository.save(employee); }

    @Override
    public Employee updateEmployee(Employee employee){
        Optional<Employee> employeeDb = this.employeeRepository.findById(employee.getId());

        if (employeeDb.isPresent()){
            Employee employeeUpdate = employeeDb.get();
            employeeUpdate.setId(employee.getId());
            employeeUpdate.setNik(employee.getNik());
            employeeUpdate.setName(employee.getName());
            employeeUpdate.setType(employee.getType());
            employeeUpdate.setPositionId(employee.getPositionId());
            employeeUpdate.setDivisionId(employee.getDivisionId());
            employeeUpdate.setLastPosition(employee.getLastPosition());
            employeeRepository.save(employeeUpdate);
            return employeeUpdate;
        }else{
            throw new ResourceNotFoundException("Record not found with id : " + employee.getId());
        }
    }

    @Override
    public List<Employee> getAllEmployee(){ return this.employeeRepository.findAll(); }

    @Override
    public Employee getEmployeeById(long employeeId){

        Optional<Employee> employeeDb = this.employeeRepository.findById(employeeId);

        if (employeeDb.isPresent()){
            return employeeDb.get();
        }else{
            throw new ResourceNotFoundException("Record not found with id : " + employeeId);
        }
    }

    @Override
    public void deleteEmployee(long employeeId){
        Optional<Employee> employeeDb = this.employeeRepository.findById(employeeId);

        if (employeeDb.isPresent()){
            this.employeeRepository.delete(employeeDb.get());
        }else{
            throw new ResourceNotFoundException("Record not found with id : " + employeeId);
        }
    }

}
