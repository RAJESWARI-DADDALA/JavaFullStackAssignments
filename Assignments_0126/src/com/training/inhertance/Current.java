package com.training.inhertance;

public class Current extends Account {
	
	double curbalence;
	
	public Current(double balence) {
		super(balence);
		this.curbalence = balence;
	}
	
	public void withdraw(double amount) {
		balence = curbalence - amount;
		
	}
	
	public void deposit(double amount) {
		balence = curbalence + amount;
		
	}

}
