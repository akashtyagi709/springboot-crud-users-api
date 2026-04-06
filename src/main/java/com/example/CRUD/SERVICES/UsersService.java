package com.example.CRUD.SERVICES;

import com.example.CRUD.ENTITY.UsersEntity;
import com.example.CRUD.REPO.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired UsersRepo usersRepo;

    public UsersEntity addNewUser(UsersEntity usersEntity){
        return this.usersRepo.save(usersEntity);
    }

    public List<UsersEntity> getAllUsers(){
        return  this.usersRepo.findAll();
    }

    public UsersEntity getUserById(Integer id){
        return  this.usersRepo.getUserById(id);
    }

    public UsersEntity updateUser(Integer id,UsersEntity usersEntity){
        UsersEntity existingUser= this.usersRepo.findById(id).orElseThrow(()->new RuntimeException("user not found"));
        existingUser.setEmail(usersEntity.getEmail());
        existingUser.setName(usersEntity.getName());
        existingUser.setPassword(usersEntity.getPassword());
        return  this.usersRepo.save(existingUser);
    }

    public void deleteUser(Integer id){
        UsersEntity user= this.usersRepo.findById(id).orElseThrow(()->new RuntimeException("user not found"));
        this.usersRepo.delete(user);
    }

}