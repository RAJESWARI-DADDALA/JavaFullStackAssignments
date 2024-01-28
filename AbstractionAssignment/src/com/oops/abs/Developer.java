package com.oops.abs;

public class Developer extends TeamLead {

	double chargesperHour;
	String sportsName;
	
	public Developer(String empName, double salary, int empid, double chargesperHour, String sportsName) {
		super(empName, salary, empid);
		this.chargesperHour = chargesperHour;
		this.sportsName = sportsName;
	}

	@Override
	String[] showCourses() {
		String[] course = {"snowflake","JavaScript"};
		return null;
	}

	@Override
	void showProjects() {
    System.out.println("Developer projects");
	}
	void gamesClub()
	{
		System.out.println(sportsName+""+chargesperHour);
	}

}
