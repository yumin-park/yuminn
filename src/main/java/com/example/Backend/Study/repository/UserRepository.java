package com.example.Backend.Study.repository;


import com.example.Backend.Study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long>{
    }
