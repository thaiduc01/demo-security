package com.example.demosecurity.repository.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demosecurity.entity.UserEntity;
import com.example.demosecurity.repository.UserRepository;

@Repository
public class UserRepositoryImp implements UserRepository{
    @PersistenceContext
    private EntityManager entityManager;
   @Override 
    public List<UserEntity> findAll(){
        String query = "Select * from user";
        List<UserEntity> result = entityManager.createNativeQuery(query,UserEntity.class).getResultList();
        return result;
    }
   
   @Override
   public UserEntity findById(Long id) {
       return entityManager.find(UserEntity.class, id);
   }
    
   @Override
   public void save(UserEntity entity) {
       entityManager.persist(entity);
   }
   
   @Override
   public void delete(UserEntity entity) {
       entityManager.remove(entity);
   }
    
     
}
