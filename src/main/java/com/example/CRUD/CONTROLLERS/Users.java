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

    @GetMapping("/getAllUsers")
    public ResponseEntity<ApiResponse<List<UsersEntity>>> getAll(){
        List<UsersEntity> users=this.usersService.getAllUsers();
        ApiResponse<List<UsersEntity>> response;
        if (users.isEmpty()){
            response= new ApiResponse<>("Data not found.",false,users);
            return ResponseEntity.status(404).body(response);
        }else{
            response=new ApiResponse<>("Data fetch successfully.",true,users);
            return ResponseEntity.status(200).body(response);
        }
    }

    @GetMapping("/getuserbyId/{id}")
    public  ResponseEntity<ApiResponse<UsersEntity>> getById(@PathVariable  Integer id){
        UsersEntity user= this.usersService.getUserById(id);
        ApiResponse<UsersEntity> response;
        if (user==null){
            response = new ApiResponse<>("User not found ",false,user);
            return  ResponseEntity.status(404).body(response);
        }else{
            response= new ApiResponse<>("User data found Successfully",true,user);
            return  ResponseEntity.status(200).body(response);
        }
    }

    @PostMapping("/addUser")
    public ResponseEntity<ApiResponse<UsersEntity>> addUser(@RequestBody UsersEntity usersEntity){
        UsersEntity savedUsers =this.usersService.addNewUser(usersEntity);
        ApiResponse<UsersEntity> response= new ApiResponse<>("User created Successfully",true,savedUsers);
        return  ResponseEntity.status(200).body(response);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<ApiResponse<UsersEntity>> updateUser(@PathVariable Integer id,@RequestBody UsersEntity usersEntity){
        UsersEntity usersEntity1 = this.usersService.updateUser(id,usersEntity);
        ApiResponse<UsersEntity> response;
        if (usersEntity1==null){
            response= new ApiResponse<>("User not updated",false,usersEntity1);
            return ResponseEntity.status(404).body(response);
        }
        else{
            response=new ApiResponse<>("User Updated Successfully",true,usersEntity);
            return ResponseEntity.status(200).body(response);
        }
    }
    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<ApiResponse<String>> deleteUser(@PathVariable Integer id){
         this.usersService.deleteUser(id);
         ApiResponse<String> response= new ApiResponse<>("User Deleted Succesfully",true,null);
        return ResponseEntity.ok(response);
    }

}