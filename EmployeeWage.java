package com.bridelabz;

public class EmployeeWage {

	public static final int Emp_present = 1;
	public static final int Half_time = 2;
	public static final int Wage_per_hour = 20;
	public static final int Num_of_working_days = 20;

	public static void main(String[] args) {

		int empHrs = 0, empWage = 0, totalEmpWage = 0;
		for (int days = 0; days < Num_of_working_days; days++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case Emp_present:
				empHrs = 4;
				break;
			case Half_time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}

			empWage = empHrs * Wage_per_hour;
			totalEmpWage += empWage;
			System.out.println("Total_Salary :" + empWage);
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

}
