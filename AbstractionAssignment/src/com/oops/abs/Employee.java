package com.oops.abs;

public abstract class Employee {
	String empName;
	double salary;
	int empid;
	final String COMPANYNAME = "TATA";

	public Employee(String empName, double salary, int empid) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empid = empid;
	}

	void printDetails() {
		System.out.println("EmpName is " + empName);
		System.out.println("EmpSalary is " + salary);
		System.out.println("EmpId is " + empid);
	}

	abstract void calcBonus(double amount);

    String[] showCourses()
	{
		String[] courses = {"java","C#"};
		return courses;
	}

	abstract void showProjects();

	final void showRules() {
		officeHours();
		System.out.println("Leave Policies");
		System.out.println("OT Policies");
	}

	private void officeHours() {
		System.out.println("8 hours per day");
	}

}
