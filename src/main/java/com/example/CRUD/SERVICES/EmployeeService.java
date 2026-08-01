package com.example.CRUD.SERVICES;

import com.example.CRUD.ENTITY.Employee;
import com.example.CRUD.REPO.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Cacheable("employee")
    public List<Employee> getAllEmployees() {
        System.out.println("Fetching from Database");
        return employeeRepository.findAll();
    }

    @Cacheable(value = "employee" ,key = "#id")
    public Employee getUserbyId(Integer id){
        return  employeeRepository.getUserById(id);
    }

    @CachePut(value = "employee" ,key = "#employee.id")
    public Employee saveUser(Employee employee){
         return employeeRepository.save(employee);
    }

    @CacheEvict(value = "employee",key = "#id")
    public void deletebyId(Integer id){
          employeeRepository.deleteById(id);
    }



}
