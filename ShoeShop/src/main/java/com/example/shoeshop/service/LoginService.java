package com.example.shoeshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoeshop.model.Login;
import com.example.shoeshop.repository.LoginRepository;


@Service
public class LoginService {

	@Autowired
	LoginRepository lr;
	
	public Login saveUser(Login u)
	{
	      return lr.save(u);
	}
	
	
	public String validateUser(String firstname,String password)
	{
		Login u=lr.findByFirstname(firstname);
		
		if(u==null){
			
			return "Login failed";
		}
		else{
				if(u.getPassword().equals(password)){
					
					return "Login successful";
				}
				else{
					
					return "Login failed";
				}
			}
		

		
		}
}
