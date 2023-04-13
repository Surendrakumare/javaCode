package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="studentDetails")
public class Entityclass {
@Id
int id;
@Column(name="name")
String name ;
@Column(name="roll")
int roll;
}
