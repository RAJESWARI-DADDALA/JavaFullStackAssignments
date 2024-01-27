package com.training.inhertance;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee("Raji", "Manager");
		System.out.println("Manager Bonus : "+employee.calBonus(100.00, 500.00));
		Employee employee1 = new Employee("Umesh", "Programmer");
		System.out.println("Programmer Bonus : "+employee1.calBonus(100.00));
		
		Employee employee2 = new Employee("Mahesh", "Director");
		System.out.println("Director Bonus "+ employee2.calBonus(100.00, 500.00, 500.00));
		
	}
	
	

}
