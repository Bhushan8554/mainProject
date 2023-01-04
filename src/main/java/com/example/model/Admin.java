package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Admin {

	@Id
	private String mobileNumber;
	private String username;
	private String email;
	private String password;
	private String role;
	
}
