package com.crud.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CrudDemo {
	
	@Id
	private int id;
	
	private String Username;
	private String Password;
	
	
	CrudDemo(){}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
