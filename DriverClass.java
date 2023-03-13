package scheduler.driverclass;

import scheduler.department.*;

public class DriverClass {

	public static void main(String[] args) {
		HrDepartment hrDeparment = new HrDepartment();
		TechDepartment techDeparment = new TechDepartment();
		AdminDepartment adminDeparment = new AdminDepartment();
		System.out.println("Welcome to " + adminDeparment.deparmentName());
		System.out.println(adminDeparment.getTodaysWork());
		System.out.println(adminDeparment.getWorkDeadline());
		System.out.println(adminDeparment.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + hrDeparment.deparmentName());
		System.out.println(hrDeparment.doActivity());
		System.out.println(hrDeparment.getTodaysWork());
		System.out.println(hrDeparment.getWorkDeadline());
		System.out.println(hrDeparment.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + techDeparment.deparmentName());
		System.out.println(techDeparment.getTodaysWork());
		System.out.println(techDeparment.getWorkDeadline());
		System.out.println(techDeparment.getTechStackInformation());
		System.out.println(techDeparment.isTodayAHoliday());
		System.out.println();

	}

}
