package com.codility.iteration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class BinaryGapModified2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<Integer> set = new HashSet<Integer>();
		HashMap<Integer,HashSet<Integer>> map = new HashMap<Integer,HashSet<Integer>>();
		Scanner sc = new Scanner(System.in);
		char choice = 'y';
		int maxGap = 0;
		int n = 0;
		do {
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		char[] ch = binary.toCharArray();
		boolean start = false;
		maxGap = 0;
		int gap = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='0' && start) {
				gap++;
			}
			if(ch[i]=='1' && start) {
				maxGap = Math.max(maxGap, gap);
				start = false;
				gap = 0;
			}
			if(ch[i]=='1' && !start){
				start = true;
			}
		}
		boolean flag = false;
		for(Map.Entry<Integer,HashSet<Integer>> m: map.entrySet()) {
			if(m.getKey()==maxGap) {
				HashSet<Integer> s1 = m.getValue();
				s1.add(n);
				m.setValue(s1);
				flag = true;
				break;
			}
		}
		if(!flag) {
			HashSet<Integer> s1 = new HashSet<Integer>();
			s1.add(n);
			map.put(maxGap,s1);
		}
		
		System.out.println("Do you want to continue(y/n)?");
		choice = sc.next().charAt(0); 
		}
		while(choice == 'y');
		System.out.println("Enter the maxgap value to check");
		int input = sc.nextInt();
		boolean f = false;
		for(Map.Entry<Integer,HashSet<Integer>> m: map.entrySet()) {
			if(m.getKey()==input) {
				f = true;
				HashSet<Integer> list = m.getValue();
				for(Integer i:list) {
					System.out.println(i);
				}
				break;
			}
		}
		if(!f) {
			System.out.println("No matching key");
		}
	}
}
