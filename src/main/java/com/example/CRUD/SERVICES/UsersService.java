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

}
