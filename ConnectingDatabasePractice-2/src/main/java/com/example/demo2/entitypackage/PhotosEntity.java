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
@Table(name="photos")
public class PhotosEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="albumId")
	private int albumId;
	@Column(name="id")
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="url")
	private String url;
	@Column(name="thumbnailer")
	private String thumbnailer;

}
