package com.twitterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Combination of @Controller+@ResponseBody=@RestController
public class TwitterDemoController {

	//@RequestMapping(value="/login",method=RequestMethod.Get)
	
	@GetMapping("/login")
	public String Login() {
		
		return "Welcome to Twitter Login";
	}
	//web---127.0.0.1:8080/login
	
	
	
	@GetMapping("/landingpage/{username}")
	
	public String Land(@PathVariable("username") String username) {
		
		return "welcome "+username+" to Twitter Home Page";
	}
	//web--- localhost:8080/landingpage/Rathi
	
	
	@GetMapping("/landingpage/{username}/{age}")
		
	public String Land(@PathVariable("username") String username,@PathVariable("age") int age) {
			
		return "welcome "+username+" to Twitter Home Page your age is "+age;
	}
	//web--- localhost:8080/landingpage/Rathi/18
	
	
	
	String uname ="Rathi Prabha";
	String dept="EEE";
	String sec="B";
	String uage="18";
	
	@GetMapping("/db")
	public String Details() {
		
		return("Your Name: "+uname+", Your age: "+uage+", Your department: "+dept+", Your Section: "+sec);
	}
	//web--- localhost:8080/db
	
	
	
	@GetMapping("/user")
	public String getPost(@RequestParam String user) {
		
		return "The Post Of "+user;
	}
	//web--- localhost:8080/user?user=Rathi Prabha
	
	
	
	
	
	@GetMapping("/post")
	public String getPost(@RequestParam String from,@RequestParam String to) {
	
		return "The Post Letter is posted to "+to+" from "+from;
	}
	//web-- localhost:8080/post?from=....&to=....
	//web-- localhost:8080/post?from=sabika&to=rathi
	
	
	
	
	
	
	@GetMapping("/log")
	public String getLogin(@RequestParam String username,@RequestParam String password) {
		
		if(username.equals("Rathi Prabha")&&password.equals("Rathi@31")){
			
			return "Login Successfull";
		}
		else {
			
			return "Login Failed!!! please check your username and password";
		}
	}
}
