package com.training.inhertance;

public class Employee {

	String name;
	String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	
	public double calBonus(double basicAllowence) {
		
		return basicAllowence;
	}
	
	public double calBonus(double basicAllowence, double carAllowence) {
		
		return basicAllowence + carAllowence;
	}
	
	public double calBonus(double basicAllowence, double carAllowence, double houseAllowence) {
		
		return basicAllowence + carAllowence +houseAllowence ;
	}
	
}
