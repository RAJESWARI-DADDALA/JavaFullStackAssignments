package com.training.quest1;

public class EmployeeCourses implements Institute{

	@Override
	public String[] showCourses()
	{
		String[] courses = {"JFS","Angular","Cloud","Spring"};
		return courses;
	}

}
