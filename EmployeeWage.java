package com.bridelabz;

public class EmployeeWage {

	public static final int Emp_present = 1;
	public static final int Half_time = 2;
	public static final int Wage_per_hour = 20;

	public static void main(String[] args) {

		int Emp_hour = 0;

		int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empcheck) {
		case Emp_present:
			Emp_hour = 8;
			break;
		case Half_time:
			Emp_hour = 4;
			break;
		default:
			Emp_hour = 0;
		}
		int Total_Salary = Wage_per_hour * Emp_hour;
		System.out.println("Total_Salary :" + Total_Salary);

	}

}