package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P03_3 {
	
	  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the percentage: ");
	        double percentage = scanner.nextDouble();
	 
	        String grade = calculateGrade(percentage);
	        System.out.println("Grade: " + grade);
	    }
	 
	    public static String calculateGrade(double percentage) {
	        if (percentage >= 60) {
	            return "A";
	        } else if (percentage >= 45) {
	            return "B";
	        } else if (percentage >= 35) {
	            return "C";
	        } else {
	            return "Fail";
	        }
	    }
	}
