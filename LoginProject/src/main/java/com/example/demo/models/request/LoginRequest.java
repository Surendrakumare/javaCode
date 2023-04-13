package com.example.demo.models.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginRequest {

	@NotNull
	@Size(min = 4, max = 15)
	private String userName;

	@NotNull
	@Size(min = 4, max = 15)
	private String password;
}
