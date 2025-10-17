package com.example.demo.service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @SuppressWarnings("unused")
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int employeeId) {

        Optional<Employee> result = employeeRepository.findById(employeeId);

        Employee employee;

        if (result.isPresent()){
            employee = result.get();
        }else{
            throw  new RuntimeException("Did not find the id - " + employeeId);
        }

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
