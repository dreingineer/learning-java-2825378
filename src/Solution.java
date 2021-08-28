package src;

import java.util.Scanner;

public class Solution {
	
	public static double salaryCalculator(double hpw, double rph, double vd) {
		double weeklySalary = hpw * rph;
		double dailyRate = weeklySalary / 7;
		double yearlySalary = weeklySalary * 52;
		
		//leave deductions or unpaidTime
		double leaveDeductions = vd * rph * 8;
		
		double totalSalary = yearlySalary - leaveDeductions;
		return totalSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("I will compute your salary.");
		System.out.println("Enter your number of hours per week:");
		double hoursPerWeek = input.nextDouble();
		if(hoursPerWeek <= 0) {
			System.out.println("Enter number of hours more than zero (0).");
			return;
		}
		System.out.println("Enter your rate per hour:");
		double ratePerHour = input.nextDouble();
		if(ratePerHour <= 0 ) {
			System.out.println("Working hour should be more than 0");
			return;
		}
		System.out.println("How many days of vacation did you take?");
		double vacationDays = input.nextDouble();
		
		double grossSalary = salaryCalculator(hoursPerWeek, ratePerHour, vacationDays);
		System.out.println("#################################");
		System.out.println("Your total salary minus decution is " + grossSalary + " Pesos.");
	}
}
