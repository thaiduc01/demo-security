package com.example.demosecurity.repository;

import java.util.List;

import com.example.demosecurity.entity.RoleEntity;

public interface RoleRepository {

    List<RoleEntity> findAll();
}
