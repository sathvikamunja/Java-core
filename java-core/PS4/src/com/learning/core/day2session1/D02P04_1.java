package com.learning.core.day2session1;
import java.util.Scanner;
public class D02P04_1 {
	
	 
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
	        // Accept two numbers from the user
	        System.out.print("Enter two numbers in the range from 1 to 40 separated by space: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	 
	        // Define the single dimension array of five integer elements ranging in value from 1 to 40
	        int[] array = {7, 25, 5, 19, 30, 9, 17, 3, 39, 8};
	 
	        // Check if both inputted values are found in the array element
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;
	        for (int i : array) {
	            if (i == num1) {
	                foundNum1 = true;
	            }
	            if (i == num2) {
	                foundNum2 = true;
	            }
	        }
	 
	        // Display the result
	        if (foundNum1 && foundNum2) {
	            System.out.println("Bingo");
	        } else {
	            System.out.println("Not Found Its Bingo");
	        }
	    }
	}


