package com.bridelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage");
		int Emp_present = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;

		if (empcheck == Emp_present) {
			System.out.println("Employee is present");

		} else {
			System.out.println("Employee is absent");
		}
	}

}
