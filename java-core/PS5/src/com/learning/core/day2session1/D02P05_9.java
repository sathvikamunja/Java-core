package com.learning.core.day2session1;

public class D02P05_9 {
	
	    public static void main(String[] args) {
	        String input = "Ms Marry Smith";
	        String output = replaceSpaces(input);
	        System.out.println(output);
	    }
	 
	    public static String replaceSpaces(String input) {
	        StringBuilder stringBuilder = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            if (c == ' ') {
	                stringBuilder.append("%20");
	            } else {
	                stringBuilder.append(c);
	            }
	        }
	        return stringBuilder.toString();
	    }
	}


