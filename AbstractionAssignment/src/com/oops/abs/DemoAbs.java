package com.oops.abs;

public class DemoAbs {

	public static void main(String[] args) {
     Employee employee = new Manager("Raji",20000,1,"Sports");
     employee.showCourses();
     employee.showProjects();
     employee.calcBonus(4000);
     Manager manager = new Manager("Mahi",30000,2,"Fun");
     manager.funClub();
     TeamLead teamlead = new Developer("Esh",35000.00,3,10.00,"Club");
     teamlead.showCourses();
     teamlead.showProjects();
     Developer developer = new Developer("Rama",1000.00,4,20.00,"Gym");
     developer.gamesClub();
	}

}
