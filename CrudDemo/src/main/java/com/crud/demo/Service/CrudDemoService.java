package com.crud.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.demo.model.CrudDemo;
import com.crud.demo.repository.CrudDemoRepository;

@Service
public class CrudDemoService {

	@Autowired
	public CrudDemoRepository crp;
	
	public CrudDemo saveInfo(CrudDemo a) {
		
		return crp.save(a);
	}
	public CrudDemo editInfo(CrudDemo a) {
			
			return crp.save(a);
		}
	public List<CrudDemo> getAllDetails(){
		
		return crp.findAll();
	}
	public CrudDemo getDetailsById(@PathVariable int id) {
	
		return crp.findById(id).orElse(null);
	}
	public void deleteDetailsById(int id)
    {
        crp.deleteById(id);
    }
}