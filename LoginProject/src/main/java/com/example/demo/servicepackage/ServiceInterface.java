package com.example.demo.servicepackage;

import org.springframework.http.ResponseEntity;

import com.example.demo.dtopackage.UserDto;

public interface ServiceInterface {
	public ResponseEntity<Object> getall(String Username, String pass);

	public ResponseEntity<Object> getAllUsers();

	public ResponseEntity<Object> insertvalues(UserDto user);

	public ResponseEntity<Object> insertvaluesuseingnamedparameters(UserDto user);
}
