package dev.es.springbootdemo.springbootdemo.dao;


import dev.es.springbootdemo.springbootdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
