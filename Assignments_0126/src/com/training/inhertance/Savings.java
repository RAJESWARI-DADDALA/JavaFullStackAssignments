package com.training.inhertance;

public class Savings extends Account{
	double savbalence;
	
	public Savings(double balence) {
		super(balence);
		this.savbalence = balence;
	}
	
	public void withdraw(double amount) {
		balence = savbalence - amount;
		
	}
	
	public void deposit(double amount) {
		balence = savbalence + amount;
		
	}
	

}
