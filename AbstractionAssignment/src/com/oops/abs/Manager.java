package com.oops.abs;

public class Manager extends Employee {
	String activity;
	

	public Manager(String empName, double salary, int empid, String activity) {
		super(empName, salary, empid);
		this.activity = activity;
	}

	@Override
	void calcBonus(double amount) 
	{
		
System.out.println("Manager amount");
	}

	@Override
	String[] showCourses() {
		String[] course = {"C","Hadoop"};
		return course;
	}

	@Override
	void showProjects() 
	{
    System.out.println("MJava"+"MC#");
	}
	void funClub()
	{
		System.out.println("Activity"+activity);
	}

}
