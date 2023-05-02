package com.example.shoeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoeshop.model.ShoeShop;
import com.example.shoeshop.service.ShoeShopService;

@RestController
public class ShoeShopController {

	@Autowired
	ShoeShopService ss;
	
	@GetMapping("/getAll")
	
	public List<ShoeShop> getAllDetails(){
		
		return ss.getAllDetails();
	}
	
	@PostMapping("/postshoedetails")
	
	public String postShoeDetails(@RequestBody ShoeShop id) {
		
		ss.postShoeDetails(id);
		return "Details Saved";
	}
	
	@PutMapping("/putshoedetails")
	
	public ShoeShop putShoeDetails(@RequestBody ShoeShop id) {
		
		return ss.putShoeDetails(id);
	}
	
	@GetMapping("/getshoedetailsbyid")
	
	public ShoeShop getDetailsById(@RequestParam int id) {
		
		return ss.getDetailsById(id);
	}
	
	@DeleteMapping("/deletebyid")
	
	public String deleteDetailsById(@RequestParam int id) {
		
		ss.deleteDetailsById(id);
		return "Shoe Details are deleted";
	}
	
	@GetMapping("/sortDetails")
	
	public List<ShoeShop> sortDetails(@RequestParam String field){
		
		return ss.sortDetails(field);
	}
	
	@GetMapping("/sorttwoDetails")
		
		public List<ShoeShop> sortTwoDetails(@RequestParam String field1,@RequestParam String field2){
			
			return ss.sortTwoDetails(field1,field2);
	}
	
	@GetMapping("/pagination")
	
	public List<ShoeShop> getPagination(@RequestParam int offset,@RequestParam int pagesize){
		
		return ss.getPagination(offset,pagesize);
	}
	
	@GetMapping("/sortpagination")
		
	public List<ShoeShop> getSortPagination(@RequestParam int offset,@RequestParam int pagesize,@RequestParam String field){
			
		return ss.getSortPagination(offset,pagesize,field);
	}
	
	@GetMapping("/prefix")
	
	public List<ShoeShop> getPrefix(@RequestParam String prefix){
		
		return ss.getPrefix(prefix);
	}
	
	@GetMapping("/suffix")
		
	public List<ShoeShop> getSuffix(@RequestParam String suffix){
			
		return ss.getSuffix(suffix);
	}
	
	@GetMapping("/getbtattri")
	
	public List<ShoeShop> getByAttribute(@RequestParam String attri){
			
		return ss.getByAttribute(attri);
	}
	
	
	
}
