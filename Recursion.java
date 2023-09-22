package com.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	
	static List<Integer> list = new ArrayList<>();
	
	public static List<Integer> recursion(int n , List<Integer> arr) {
		
		if (n == 100 ) {
			return arr;
		}
		
		arr.add(n);
		list.add(n);
		return recursion(n+1 , arr);
	}
	
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		
		recursion(1 , arr);
		
		System.out.println(arr);
		System.out.println(list);

		
	}

}
