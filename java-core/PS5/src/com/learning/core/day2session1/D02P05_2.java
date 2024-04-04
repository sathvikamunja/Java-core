package com.learning.core.day2session1;
import java.util.Scanner;
public class D02P05_2 {

	 
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        System.out.println("Enter the number of vowels to count from the end:");
	        int n = scanner.nextInt();
	        
	        String lastNVowels = getLastNVowels(input, n);
	        if (lastNVowels == null) {
	            System.out.println("Mismatch in Vowel Count");
	        } 
	        else {
	            System.out.println("Last " + n + " vowels: " + lastNVowels);
	        }
	    }
	    
	    public static String getLastNVowels(String input, int n) {
	        int vowelCount = 0;
	        StringBuilder lastNVowels = new StringBuilder();
	        
	        for (int i = input.length() - 1; i >= 0; i--) {
	            char ch = Character.toLowerCase(input.charAt(i));
	            if (isVowel(ch)) {
	                lastNVowels.insert(0, ch);
	                vowelCount++;
	            }
	            if (vowelCount == n) {
	                return lastNVowels.toString();
	            }
	        }
	        
	        if (vowelCount < n) {
	            return null; // Mismatch in vowel count
	        }
	        
	        return lastNVowels.toString();
	    }
	    
	    public static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}


