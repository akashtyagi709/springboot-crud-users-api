package com.example.CRUD.SERVICES;

import com.example.CRUD.REPO.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService extends UsersService {
    @Autowired
    private UsersRepo usersRepo;

//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = usersRepo.findByEmail(email)
//
//    }
}
