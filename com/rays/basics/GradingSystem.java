package com.rays.basics;

public class GradingSystem {
	public static void main(String[] args) {
		int marks=60;
		if (marks > 90) {
			System.out.println("Your grade is A");
		}else if(marks > 80 && marks < 90 ) {
		System.out.println("Your grade is B");
	}else if (marks > 70 && marks < 80) {
		System.out.println("Your grade is C");
		}
	else if (marks < 70 && marks >60) {
		System.out.println("Your grade is D");
	}
	else {
		System.out.println("You are fail");
	}
	}

}
