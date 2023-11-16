package com.rafasuperior.deptuser.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafasuperior.deptuser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ //vai herdar do jpa repository 

}
