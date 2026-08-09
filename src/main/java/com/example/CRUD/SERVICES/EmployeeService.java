package com.example.CRUD.SERVICES;
import com.example.CRUD.ENTITY.Employee;
import com.example.CRUD.REPO.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Cacheable(value = "employees")
    public List<Employee> getAllEmployees() {
        System.out.println("Fetching all employees from Database");
        return employeeRepository.findAll();
    }


    @Cacheable(value = "employee", key = "#id")
    public Employee getEmployeebyId(Integer id) {
        System.out.println("Fetching employee by id from Database");
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }


    @Caching(
            put = {
                    @CachePut(value = "employee", key = "#result.id")
            },
            evict = {
                    @CacheEvict(value = "employees", allEntries = true)
            }
    )
    public Employee saveEmployee(Employee employee) {
        System.out.println("Saving employee");
        return employeeRepository.save(employee);
    }


    @Caching(
            evict = {
                    @CacheEvict(value = "employee", key = "#id"),
                    @CacheEvict(value = "employees", allEntries = true)
            }
    )
    public void deletebyId(Integer id) {
        System.out.println("Deleting employee");
        employeeRepository.deleteById(id);
    }
}