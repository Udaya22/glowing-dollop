package com.codility.iteration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BinaryGapModified {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
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
		for(Map.Entry<Integer,ArrayList<Integer>> m: map.entrySet()) {
			if(m.getKey()==maxGap) {
				ArrayList<Integer> list = m.getValue();
				list.add(n);
				m.setValue(list);
				flag = true;
				break;
			}
		}
		if(!flag) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(n);
			map.put(maxGap, list);
		}
		
		System.out.println("Do you want to continue(y/n)?");
		choice = sc.next().charAt(0); 
		}
		while(choice == 'y');
		System.out.println("Enter the maxgap value to check");
		int input = sc.nextInt();
		boolean f = false;
		for(Map.Entry<Integer,ArrayList<Integer>> m: map.entrySet()) {
			if(m.getKey()==input) {
				f = true;
				ArrayList<Integer> list = m.getValue();
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
