package com.example.demo.controllerClass;

import java.util.Base64;
import java.util.Base64.Decoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtopackage.UserDto;
import com.example.demo.models.request.LoginRequest;
import com.example.demo.servicepackage.ServiceInterface;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import io.jsonwebtoken.Jwts;
import jakarta.validation.Valid;

@RestController
public class AuthenticationController {
	@Autowired
	private ServiceInterface sr;

	@PostMapping(path = "/login")
	public ResponseEntity<Object> getall(@RequestBody @Valid LoginRequest loginRequest) {
		return sr.getall(loginRequest.getUserName(), loginRequest.getPassword());
	}

	@PostMapping(value = "/decoding/jwt/token", produces = "application/json")
	public String decode(@RequestBody String token) {
//		String body = token.split("\\.")[1];
//
//		Base64.Decoder decoder = Base64.getDecoder();
//
//		return new String(decoder.decode(body));
	
	
		return Jwts.parser().setSigningKey("bezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecret").parseClaimsJws(token).getBody().getSubject();
	}

	@GetMapping("/getallusers")
	public ResponseEntity<Object> getAllUser() {
		return sr.getAllUsers();
	}

	@PostMapping("/inserting values")
	public ResponseEntity<Object> insertingvalues(@RequestBody UserDto user) {
		return sr.insertvalues(user);
	}

	@PostMapping("/inserting values using named parameters")
	public ResponseEntity<Object> insertingnamedparameters(@RequestBody UserDto user) {
		return sr.insertvaluesuseingnamedparameters(user);
	}

}
