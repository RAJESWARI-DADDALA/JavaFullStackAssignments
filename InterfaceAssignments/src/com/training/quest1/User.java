package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		System.out.println("Enter user as student/Employee");
		Scanner s = new Scanner(System.in);
		String type = s.next();
		Institute institute = null;
		if (type.equalsIgnoreCase("student")) {
			institute = new StudentCourses();
		} else if (type.equalsIgnoreCase("Employee")) {
			institute = new EmployeeCourses();
		}

		String[] courses = institute.showCourses();
		System.out.println(" Courses : ");
		for (String course : courses) {
			System.out.println(course);
		}
		s.close();
	}

}
