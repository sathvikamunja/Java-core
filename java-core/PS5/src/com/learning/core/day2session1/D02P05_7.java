package com.learning.core.day2session1;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
public class D02P05_7 {
	
	    public static void main(String[] args) {
	        String[] dictionary = {"abb", "abc", "xyz", "xyy", "foo"};
	        String pattern = ".*xyy.*|.*abb.*"; // Define your pattern here
	        
	        List<String> matchingStrings = new ArrayList<>();
	        Pattern p = Pattern.compile(pattern);
	        
	        for (String str : dictionary) {
	            Matcher m = p.matcher(str);
	            if (m.matches()) {
	                matchingStrings.add(str);
	            }
	        }
	        
	        // Print the matching strings
	        for (String matchingStr : matchingStrings) {
	            System.out.println(matchingStr);
	        }
	    }
	}


