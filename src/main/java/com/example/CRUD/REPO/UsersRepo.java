package com.example.CRUD.REPO;

import com.example.CRUD.ENTITY.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Integer> {

   public UsersEntity getUserById(Integer id);

   public Optional<UsersEntity> findByEmail(String email);
}
