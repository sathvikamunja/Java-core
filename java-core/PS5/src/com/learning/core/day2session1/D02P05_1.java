package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_1 {
	
	 
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
	        // Input string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	 
	        // Display length of the string
	        int length = input.length();
	        System.out.println("Length of the string: " + length);
	 
	        // Convert string to uppercase
	        String uppercaseString = input.toUpperCase();
	        System.out.println("Uppercase string: " + uppercaseString);
	 
	        // Check if it is a palindrome
	        if (isPalindrome(input)) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }
	    }
	 
	    // Method to check if a string is palindrome
	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	 
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	}


