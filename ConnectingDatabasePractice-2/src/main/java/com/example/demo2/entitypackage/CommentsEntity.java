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
@Table(name="comments")
public class CommentsEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="postId")
	private int postId;
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name ;
	@Column(name="email")
	private String email;
	@Column(name="body")
	private String body;
	

}
