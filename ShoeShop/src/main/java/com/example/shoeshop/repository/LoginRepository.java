package com.example.shoeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoeshop.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {


	Login findByFirstname(String firstname);
}
