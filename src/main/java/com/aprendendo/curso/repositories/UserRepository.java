package com.aprendendo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
