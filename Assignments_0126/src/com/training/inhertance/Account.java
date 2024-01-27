package com.training.inhertance;

public class Account {
	
	double balence;

	public Account(double balence) {
		super();
		this.balence = balence;
	}
	
	
	public void withdraw(double amount) {
		balence = balence - amount;
	}
	
	public void deposit(double amount) {
		balence  = balence + amount;
	}
	
	public double getBalence() {
		return balence;
	}

}
