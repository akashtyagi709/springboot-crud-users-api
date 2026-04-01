package com.example.CRUD.REPO;

import com.example.CRUD.ENTITY.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Integer> {

   public UsersEntity getUserById(Integer id);
}
