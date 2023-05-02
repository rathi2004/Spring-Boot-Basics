package com.example.shoeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import com.example.shoeshop.model.ShoeShop;
import com.example.shoeshop.repository.ShoeShopRepository;

@Service
public class ShoeShopService {

	@Autowired
	ShoeShopRepository sr;

	public List<ShoeShop> getAllDetails() {
		
		return sr.findAll();
	}

	public ShoeShop postShoeDetails(ShoeShop id) {
		
		return sr.save(id);
	}

	public ShoeShop putShoeDetails(ShoeShop id) {
		
		return sr.save(id);
	}

	public ShoeShop getDetailsById(int id) {
		
		return sr.findById(id).orElse(null);
	}

	public void deleteDetailsById(int id) {
		
		sr.deleteById(id);
		
	}

	public List<ShoeShop> sortDetails(String field) {
		
		return sr.findAll(Sort.by(field));
	}

	public List<ShoeShop> sortTwoDetails(String field1, String field2) {
		
		return sr.findAll((Sort.by(Direction.DESC,field1)).and(Sort.by(field2)));
	}

	public List<ShoeShop> getPagination(int offset, int pagesize) {
		
		Page<ShoeShop> paging=sr.findAll(PageRequest.of(offset, pagesize));
		
		return paging.getContent();
	}

	public List<ShoeShop> getSortPagination(int offset, int pagesize, String field) {
		
		Page<ShoeShop> paging=sr.findAll(PageRequest.of(offset, pagesize).withSort(Sort.by(field)));
			
		return paging.getContent();
	}
	
	

	public List<ShoeShop> getPrefix(String prefix) {
		
		return sr.findByBrandStartingWith(prefix);
	}

	public List<ShoeShop> getSuffix(String suffix) {
		
		return sr.findByBrandEndingWith(suffix);
	}

	public List<ShoeShop> getByAttribute(String attri) {
		
		return sr.findByBrand(attri);
	}
}
