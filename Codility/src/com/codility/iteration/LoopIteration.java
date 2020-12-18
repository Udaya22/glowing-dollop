package com.codility.iteration;

import java.util.HashMap;
import java.util.HashSet;

public class LoopIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Sunday");
		set1.add("Monday");
		set1.add("Tuesday");
		set1.add("Wednesday");
		set1.add("Thursday");
		set1.add("Friday");
		set1.add("Saturday");
		set1.add("Sunday");
		
		for(String s:set1) {
			System.out.println(s);
		}
		
		HashMap<String,Integer> map1 = new HashMap<>();
		map1.put("abc",1);
		map1.put("xyz", 2);
		map1.put("wxy",3);
		map1.put("pqr",4);
		
		for(String s: map1.keySet()) {
			System.out.println(s);
		}
		
		for(Integer i: map1.values()) {
			System.out.println(i);
		}
	}

}
