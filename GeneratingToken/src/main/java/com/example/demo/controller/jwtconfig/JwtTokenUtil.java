package com.example.demo.controller.jwtconfig;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;

public class JwtTokenUtil implements Serializable {
	private static final long serialVersionUID = -2551546433100L;
	public static final long Jwt_token_validity = 5*60*60;
	@Value("${jwt.secret}")
	private String secrete;
	
	// retrueve username from fwt token 
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token,Claims::getSubject);
	}
	
	
	
	
}
