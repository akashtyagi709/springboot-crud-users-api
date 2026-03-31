package com.example.CRUD.CONTROLLERS;
import com.example.CRUD.CORE.ApiResponse;
import com.example.CRUD.ENTITY.UsersEntity;
import com.example.CRUD.SERVICES.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class Users {
    @Autowired UsersService usersService;
    @GetMapping("/healthcheck")
    public  String getStatusOfApi(){
        return "Hi Akash Your API is working fine.";
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<ApiResponse<List<UsersEntity>>> getAll(){
        List<UsersEntity> users=this.usersService.getAllUsers();
        ApiResponse<List<UsersEntity>> response;
        if (users.isEmpty()){
            response= new ApiResponse<>("Data not found",false,users);
            return ResponseEntity.status(404).body(response);
        }else{
            response=new ApiResponse<>("Data fetch successfully",true,users);
            return ResponseEntity.status(200).body(response);
        }
    }


    @PostMapping("/addUser")
    public ResponseEntity<ApiResponse<UsersEntity>> addUser(@RequestBody UsersEntity usersEntity){
        UsersEntity savedUsers =this.usersService.addNewUser(usersEntity);
        ApiResponse<UsersEntity> response= new ApiResponse<>("User created Successfully",true,savedUsers);
        return  ResponseEntity.status(200).body(response);
    }

}