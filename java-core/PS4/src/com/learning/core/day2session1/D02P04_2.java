package com.learning.core.day2session1;
import java.util.Scanner;
public class D02P04_2 {
	
	 
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
	        // Accepting input values from the user
	        System.out.println("Enter 18 integers separated by space:");
	        int[] a = new int[18];
	        for (int i = 0; i < a.length; i++) {
	            a[i] = scanner.nextInt();
	        }
	 
	        // Computing the sum of elements from index 0 to 14 and storing it at element 15
	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += a[i];
	        }
	        a[15] = sum;
	 
	        // Computing the average of all numbers and storing it at element 16
	        double average = (double) sum / 18;
	        a[16] = (int) average;
	 
	        // Identifying the smallest value from the array and storing it at element 17
	        int min = a[0];
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] < min) {
	                min = a[i];
	            }
	        }
	        a[17] = min;
	 
	        // Displaying the modified array
	        System.out.println("Modified array:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	 
	        scanner.close();
	    }
	}
	


