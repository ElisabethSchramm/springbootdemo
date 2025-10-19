package dev.es.springbootdemo.springbootdemo.service;


import dev.es.springbootdemo.springbootdemo.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
