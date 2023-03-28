package com.example.demosecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String passWord;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "phone")
    private String phone;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;
    
    
}
