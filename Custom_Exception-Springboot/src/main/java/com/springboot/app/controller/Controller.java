package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.StudentModel;
import com.springboot.app.service.ServiceIntf;

@RestController
@RequestMapping("/cust")
public class Controller {
	
	@Autowired
	private ServiceIntf service;

	////http://localhost:8080/cust/add
	@PostMapping("/add")
	public StudentModel addDataaa(@RequestBody StudentModel smodel){
		return service.addData(smodel);
	}
	
	@GetMapping("/getall")
	public List<StudentModel> getAll(){
		return service.getAlldata();
	}
	
	@GetMapping("/byid/{id}")
	public StudentModel getdataByid(@PathVariable int id) {
		return service.getbyId(id);
	}
	
	
}
