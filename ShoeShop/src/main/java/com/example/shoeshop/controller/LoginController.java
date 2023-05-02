package com.example.shoeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoeshop.model.Login;
import com.example.shoeshop.service.LoginService;


@RestController
public class LoginController {

	@Autowired
	LoginService ls;
	
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody Login u)
	{
		System.out.println(u.getFirstname());
		
		return ls.validateUser(u.getFirstname(),u.getPassword());
	}
	@PostMapping("/addUser")
	
	public Login saveUser(@RequestBody Login u)
	{
			return ls.saveUser(u);
	}
}
