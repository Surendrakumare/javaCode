package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repo;
@PostMapping("/posting a data")
public UserEntity post(@RequestBody UserEntity user) {
	return repo.save(user);
//return user;	
	
}

@GetMapping("/getallusers")
public List<UserEntity> getall(){
	return (List<UserEntity>) repo.findAll();
}
}
