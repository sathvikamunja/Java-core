package com.learning.core.day2session1;
import java.util.HashMap;
import java.util.Scanner;
public class D02P04_3 {
	
	 
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
	        // Prompt user to enter the size of the array
	        System.out.print("Enter the size of the array: ");
	        int N = scanner.nextInt();
	 
	        // Create the array
	        int[] arr = new int[N];
	 
	        // Prompt user to enter the elements of the array
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }
	 
	        // Use a HashMap to store the first occurrence index of each element
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int minIndex = Integer.MAX_VALUE; // Initialize the minimum index with the maximum possible value
	 
	        // Traverse the array and update the minimum index of the repeating element
	        for (int i = 0; i < N; i++) {
	            if (map.containsKey(arr[i])) {
	                int firstIndex = map.get(arr[i]);
	                minIndex = Math.min(minIndex, firstIndex);
	            } else {
	                map.put(arr[i], i);
	            }
	        }
	 
	        // Display the result
	        if (minIndex == Integer.MAX_VALUE) {
	            System.out.println("No repeating element found.");
	        } else {
	            System.out.println("Index of the first repeating element: " + minIndex);
	        }
	 
	        scanner.close();
	    }
	}

