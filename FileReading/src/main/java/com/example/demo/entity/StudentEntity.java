package com.example.demo.entity;

import org.springframework.stereotype.Component;


import lombok.Data;
@Data
@Component
public class StudentEntity {
	
	private int Id;
	private String name;
	private String section;

}
