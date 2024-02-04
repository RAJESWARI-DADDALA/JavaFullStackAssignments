package com.training.quest1;

public class StudentCourses implements Institute{
	@Override
	public String[] showCourses()
	{
		String[] courses = {"python","Java","Angualar"};
		return courses;
	}

}
