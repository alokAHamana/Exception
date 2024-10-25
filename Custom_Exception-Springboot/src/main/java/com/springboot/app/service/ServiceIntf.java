package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.StudentModel;

public interface ServiceIntf {
	
	public StudentModel addData(StudentModel model);
	
	public List<StudentModel> getAlldata(); 
	
	public StudentModel getbyId(int id);

}
