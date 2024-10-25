package com.springboot.app.CUSTOMexception;

import org.springframework.stereotype.Component;

//@Component
public class DataNotPresent extends RuntimeException {
	
	public DataNotPresent(String msg){
		
		super(msg);
	}

}
