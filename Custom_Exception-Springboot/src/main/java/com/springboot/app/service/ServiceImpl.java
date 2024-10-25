package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.CUSTOMexception.DataNotPresent;
import com.springboot.app.dao.Repository;
import com.springboot.app.model.StudentModel;

@Service
public class ServiceImpl implements ServiceIntf {

	@Autowired
	private Repository repo;
	
	public StudentModel addData(StudentModel model) {
		return repo.save(model);
	}

	public List<StudentModel> getAlldata(){
		return repo.findAll();
	}
	
	public StudentModel getbyId(int id) {
		//return repo.findById(id).get();
		
		if(id==44) {
			return new StudentModel("4","aaaaa","55","mvv");
		}else {
			throw new DataNotPresent("no data of this id present in db ");
			
		}
		
	}
}
