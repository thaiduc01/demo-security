package com.example.demosecurity.repository;


import java.util.List;

import com.example.demosecurity.entity.UserEntity;

public interface UserRepository {
  
    List<UserEntity> findAll();
    
    UserEntity findById(Long id);
    
    void save(UserEntity entity);
    
    void delete(UserEntity entity);
}
