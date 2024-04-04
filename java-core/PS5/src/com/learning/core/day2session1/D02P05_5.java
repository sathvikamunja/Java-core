package com.learning.core.day2session1;
import java.util.*;

public class D02P05_5 {
	
	public static boolean canFormCircle(String[] strings) {
	        if (strings == null || strings.length == 0) {
	            return false;
	        }
	        
	        // Create a graph represented by adjacency list
	        Map<Character, List<String>> graph = new HashMap<>();
	        for (String str : strings) {
	            char startChar = str.charAt(0);
	            char endChar = str.charAt(str.length() - 1);
	            graph.putIfAbsent(startChar, new ArrayList<>());
	            graph.get(startChar).add(str);
	            graph.putIfAbsent(endChar, new ArrayList<>());
	        }
	 
	        // Use DFS to find if there's a cycle
	        Set<String> visited = new HashSet<>();
	        for (String str : strings) {
	            if (dfs(str, graph, visited)) {
	                return true;
	            }
	        }
	 
	        return false;
	    }
	 
	    private static boolean dfs(String str, Map<Character, List<String>> graph, Set<String> visited) {
	        char endChar = str.charAt(str.length() - 1);
	        if (!graph.containsKey(endChar)) {
	            return false;
	        }
	 
	        for (String next : graph.get(endChar)) {
	            if (!visited.contains(next)) {
	                visited.add(next);
	                if (dfs(next, graph, visited)) {
	                    return true;
	                }
	                visited.remove(next);
	            } else if (visited.size() == graph.size()) {
	                return true; // All strings are visited, forming a cycle
	            }
	        }
	 
	        return false;
	    }
	 
	    public static void main(String[] args) {
	        String[] input1 = {"abc", "efg", "cde", "ghi", "ija"};
	        String[] input2 = {"Ijk", "kji", "abc", "cba"};
	 
	        System.out.println(canFormCircle(input1) ? "Yes" : "No"); // Output: Yes
	        System.out.println(canFormCircle(input2) ? "Yes" : "No"); // Output: No
	    }
	}