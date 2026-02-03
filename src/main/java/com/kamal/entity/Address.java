package com.kamal.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int H_No;
	private String city, state;
	
	@ManyToMany
	private List<Employeee> employeee;
	


	public Address() {
		super();
	}
	
	public Address( String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	
	
	public List<Employeee> getEmployeee() {
		return employeee;
	}

	public void setEmployeee(List<Employeee> employeee) {
		this.employeee = employeee;
	}
	


	public int getH_No() {
		return H_No;
	}

	public void setH_No(int H_No) {
		this.H_No = H_No;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [H_No=" + H_No + ", city=" + city + ", state=" + state + "]";
	}

}


 