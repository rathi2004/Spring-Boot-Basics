package com.codejava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejava.demo.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
