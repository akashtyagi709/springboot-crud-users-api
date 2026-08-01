package com.example.CRUD.REPO;

import com.example.CRUD.ENTITY.Employee;
import com.example.CRUD.ENTITY.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    public Employee getUserById(Integer id);

}
