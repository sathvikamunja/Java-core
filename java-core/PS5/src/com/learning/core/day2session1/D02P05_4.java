package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_4 {
	
	 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        
	        int deletions = minDeletionsForPalindrome(input);
	        System.out.println("Minimum number of deletions to make the string palindrome: " + deletions);
	    }
	    
	    public static int minDeletionsForPalindrome(String str) {
	        // Find the length of the longest palindromic subsequence
	        int longestPalindromeLength = longestPalindromeSubsequence(str);
	        
	        // Minimum number of deletions = Length of string - Length of longest palindromic subsequence
	        return str.length() - longestPalindromeLength;
	    }
	    
	    public static int longestPalindromeSubsequence(String str) {
	        // Reversing the string
	        String reversed = new StringBuilder(str).reverse().toString();
	        
	        // Finding the length of longest common subsequence between the original and reversed strings
	        return longestCommonSubsequence(str, reversed);
	    }
	    
	    public static int longestCommonSubsequence(String str1, String str2) {
	        int m = str1.length();
	        int n = str2.length();
	        
	        int[][] dp = new int[m + 1][n + 1];
	        
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
	                    dp[i][j] = 1 + dp[i - 1][j - 1];
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        
	        return dp[m][n];
	    }
	}


