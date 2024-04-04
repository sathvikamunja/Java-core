package com.learning.core.day2session1;
import java.util.HashSet;
import java.util.Set;

public class D02P05_8 {

	 public static void main(String[] args) {
	        String input1 = "Helloworld";
	        String input2 = "";
	 
	        System.out.println(canSplitIntoFourDistinctStrings(input1)); // Output: Yes
	        System.out.println(canSplitIntoFourDistinctStrings(input2)); // Output: No
	    }
	 
	    public static String canSplitIntoFourDistinctStrings(String input) {
	        if (input.length() < 4) {
	            return "No";
	        }
	 
	        Set<String> distinctStrings = new HashSet<>();
	 
	        for (int i = 1; i < input.length(); i++) {
	            for (int j = i + 1; j < input.length(); j++) {
	                for (int k = j + 1; k < input.length(); k++) {
	                    String substring1 = input.substring(0, i);
	                    String substring2 = input.substring(i, j);
	                    String substring3 = input.substring(j, k);
	                    String substring4 = input.substring(k);
	 
	                    distinctStrings.clear();
	                    distinctStrings.add(substring1);
	                    distinctStrings.add(substring2);
	                    distinctStrings.add(substring3);
	                    distinctStrings.add(substring4);
	 
	                    if (distinctStrings.size() == 4) {
	                        return "Yes";
	                    }
	                }
	            }
	        }
	 
	        return "No";
	    }
	}


