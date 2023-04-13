package com.example.demo2.entitypackage.entityEmbade;

import jakarta.persistence.Embeddable;
import lombok.Data;
@Data
@Embeddable
public class Geo {
	private double lat;
	private double lng;

}
