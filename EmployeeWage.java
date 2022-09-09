package com.bridelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		int Emp_present = 1;
		int Half_time = 2;
		int Wage_per_hour = 20;
		int Full_day_hour = 8;
		int Part_time_hour = 4;
		
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == Emp_present) {
			int Total_Salary = (Wage_per_hour * Full_day_hour);
			System.out.println("Total_Salary :" + Total_Salary);
		} else if (empcheck == Half_time) {
			int Part_time_Salary = (Wage_per_hour * Part_time_hour);
			System.out.println("Part_time_Salary :" + Part_time_Salary);

		} else {

			System.out.println("The Salary is Zero");
		}
	}
}