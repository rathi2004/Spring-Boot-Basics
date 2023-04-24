package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

class RestSampleController {
	@ResponseBody
	@RequestMapping(value="/msg",method=RequestMethod.GET)
	
	public String Print() {
		
		return "WELCOME";
	}
	@ResponseBody
	@RequestMapping("/hi")
	public int number() {
		
		return 6+1;
	}
}
