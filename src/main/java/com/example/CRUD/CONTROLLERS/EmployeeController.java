package com.example.CRUD.CONTROLLERS;

import com.example.CRUD.CORE.ApiResponse;
import com.example.CRUD.ENTITY.Employee;
import com.example.CRUD.ENTITY.UsersEntity;
import com.example.CRUD.SERVICES.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public ResponseEntity<ApiResponse<List<Employee>>> getAllEmployees() {
        List<Employee>  employees=employeeService.getAllEmployees();
        ApiResponse<List<Employee>> response;
        if (employees.isEmpty()){
            response = new ApiResponse<>("No Data Found ",false,employees);
            return ResponseEntity.status(200).body(response);
        }

        response= new ApiResponse<>("Data Found Successfully",true,employees);
        return ResponseEntity.ok(response);

    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<ApiResponse<Employee>> getUser(@PathVariable Integer id){
        Employee employee =this.employeeService.getUserbyId(id);
        ApiResponse<Employee> response;
        if (employee==null){
            response = new ApiResponse<>("User not found ",false,employee);
            return  ResponseEntity.status(404).body(response);
        }else{
            response= new ApiResponse<>("User data found Successfully",true,employee);
            return  ResponseEntity.status(200).body(response);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<Employee>> saveEmp(@RequestBody Employee  employee){
        Employee newemployee = this.employeeService.saveUser(employee);
        ApiResponse<Employee> response= new ApiResponse<>("Data Saved.",true,newemployee);
        return ResponseEntity.ok(response);
    }



}
