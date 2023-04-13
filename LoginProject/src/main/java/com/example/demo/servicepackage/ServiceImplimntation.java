package com.example.demo.servicepackage;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dtopackage.UserDto;
import com.example.demo.models.response.CustomResponse;
import com.example.demo.models.response.JwtResponse;
import com.example.demo.repository.RepositoryInterface;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class ServiceImplimntation implements ServiceInterface {
	@Autowired
	private RepositoryInterface repo;

	public ResponseEntity<Object> getall(String username, String pass) {
		if (repo.getPassword(username, pass) > 0) {
			UserDto userDto = repo.getUser(username);
			String token = generateToken(userDto);
			return new ResponseEntity<Object>(new CustomResponse(new JwtResponse(token), HttpStatus.OK.value()),
					HttpStatus.OK);
		}
		return new ResponseEntity<Object>(new CustomResponse("Login failed", HttpStatus.UNAUTHORIZED.value()),
				HttpStatus.UNAUTHORIZED);
	}

	@Override
	public ResponseEntity<Object> getAllUsers() {
		List<UserDto> users = repo.getAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity<Object>(new CustomResponse("users table is empty", HttpStatus.NOT_FOUND),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(new CustomResponse(users, "users data found", HttpStatus.OK.value()),
				HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Object> insertvalues(UserDto user) {
		return repo.insertvalues(user);
	}

	@Override
	public ResponseEntity<Object> insertvaluesuseingnamedparameters(UserDto user) {
		return repo.insertvaluesusingnamedparameters(user);

	}

	// generate token for user
	public String generateToken(UserDto userDetails) {
		Map<String, Object> claims = new HashMap<String, Object>();
		claims.put("userId", userDetails.getUid());
		return doGenerateToken(claims, userDetails.getUsername());
	}
 
	// while creating the token -
	// 1. Define claims of the token, like Issuer, Expiration, Subject, and the ID
	// 2. Sign the JWT using the HS512 algorithm and secret key.
	// 3. According to JWS Compact
	// Serialization(https://tools.ietf.org/html/draft-ietf-jose-json-web-signature-41#section-3.1)
	// compaction of the JWT to a URL-safe string
	private String doGenerateToken(Map<String, Object> claims, String subject) {

		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000000))
				.signWith(SignatureAlgorithm.HS512, "bezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecretbezKoderSecret").compact();
	}

}
