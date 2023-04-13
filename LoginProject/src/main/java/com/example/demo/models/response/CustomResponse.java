package com.example.demo.models.response;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import com.example.demo.dtopackage.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponse {

	private Object response;
	private Date timeStamp = new Date();
	private int statusCode;
	private HttpStatus statusCode1;
	@Autowired
	private List<UserDto> users;

	public CustomResponse(Object response,int statusCode) {
		this.response = response;
		this.statusCode = statusCode;
	}
	public CustomResponse(Object reponse ,HttpStatus statusCode1) {
		this.response=response;
		this.statusCode1=statusCode1;
		
		
		
	}
	public CustomResponse(List<UserDto> users, String response, int statusCode) {
		this.users=users;
		this.response=response;
		this.statusCode=statusCode;
		
		
		
	}

}
