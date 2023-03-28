package com.example.demosecurity.repository.implementations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demosecurity.entity.RoleEntity;
import com.example.demosecurity.repository.RoleRepository;
@Repository
public class RoleRepositoryImp implements RoleRepository {
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<RoleEntity> findAll(){
        String query = "Select * from role";
        List<RoleEntity> result = entityManager.createNativeQuery(query,RoleEntity.class).getResultList();
        return result;
    }

}
