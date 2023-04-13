package com.example.demo2.entitypackage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="posts")
public class PostsEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
@Column(name="id")
private int id;
@Column(name="title")
private String title;
@Column(name="body")
private String body;

}
