package com.example.demo.repository;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.dtopackage.UserDto;

public interface RepositoryInterface {
	Integer getPassword(String username, String password);

	List<UserDto> getAllUsers();

	ResponseEntity<Object> insertvalues(UserDto user);

	ResponseEntity<Object> insertvaluesusingnamedparameters(UserDto user);

	UserDto getUser(String userName);
}
