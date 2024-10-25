package com.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.StudentModel;
@org.springframework.stereotype.Repository

public interface Repository  extends JpaRepository<StudentModel, Integer>{

}
