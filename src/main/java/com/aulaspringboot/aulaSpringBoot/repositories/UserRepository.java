package com.aulaspringboot.aulaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringboot.aulaSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
