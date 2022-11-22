package com.itved.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sal")
	private int sal;
	
	@Column(name = "address")
	private int address;
	
	
	public Employee() {
		
	}


	public Employee(int id, String name, int sal, int address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public int getaddress() {
		return address;
	}


	public void setaddress(int address) {
		this.address = address;
	}


}
