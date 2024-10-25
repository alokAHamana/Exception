package com.springboot.app.GLOBALException;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.CUSTOMexception.DataNotPresent;
import com.springboot.app.model.ApiErrorModel;

@RestController
@ControllerAdvice
public class GlobalExcpHandel {

	@ExceptionHandler(DataNotPresent.class)
	public ResponseEntity<ApiErrorModel> handelNotFount() {
		
		ApiErrorModel error= new ApiErrorModel(401,"Not fount...", new Date());
		return new ResponseEntity<ApiErrorModel>(error, HttpStatus.BAD_REQUEST);
	}
}
