package com.learning.core.day2session1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class D02P04_4 {
	
	 
	
	    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 
	        // Prompt user to enter the array and the value of k
	        System.out.println("Enter the array elements separated by space:");
	        String[] inputArr = scanner.nextLine().split(" ");
	        int[] nums = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();
	        
	        System.out.print("Enter the value of k: ");
	        int k = scanner.nextInt();
	 
	        // Find all distinct combinations
	        List<List<Integer>> result = new ArrayList<>();
	        findCombinations(nums, k, 0, new ArrayList<>(), result);
	 
	        // Display the distinct combinations
	        System.out.println("Distinct combinations:");
	        for (List<Integer> combination : result) {
	            System.out.println(combination);
	        }
	 
	        scanner.close();
	    }
	 
	    private static void findCombinations(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
	        if (k == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }
	 
	        for (int i = start; i < nums.length; i++) {
	            current.add(nums[i]);
	            findCombinations(nums, k - 1, i + 1, current, result);
	            current.remove(current.size() - 1);
	        }
	    }
	}

