package com.example.demo2.entitypackage;

import com.example.demo2.entitypackage.entityEmbade.Address;
import com.example.demo2.entitypackage.entityEmbade.Company;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="users")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Embedded
	private Address address;
	@Column(name="phone")
	private String phone;
	@Column(name="website")
	private String website;
	@Embedded
	private Company company;
	

}
