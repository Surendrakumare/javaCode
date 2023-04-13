package com.example.demo2.entitypackage.entityEmbade;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;
@Data
@Embeddable
public class Address {
	private String street;
	private String suite;
	private String city;
	private int zipcode;
	@Embedded
	private Geo geo;

}
