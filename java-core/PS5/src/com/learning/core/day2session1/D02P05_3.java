package com.learning.core.day2session1;
import java.util.*;


public class D02P05_3 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        
	        System.out.println("Subsequences:");
	        printSubsequences(input);
	    }
	    
	    public static void printSubsequences(String input) {
	        printSubsequencesHelper(input, "", 0);
	    }
	    
	    private static void printSubsequencesHelper(String input, String current, int index) {
	        if (index == input.length()) {
	            if (!current.isEmpty()) {
	                System.out.print(current + ", ");
	            }
	            return;
	        }
	        
	        // Include current character
	        printSubsequencesHelper(input, current + input.charAt(index), index + 1);
	        
	        // Exclude current character
	        printSubsequencesHelper(input, current, index + 1);
	    }
	}

