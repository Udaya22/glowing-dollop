package com.codility.iteration;

import java.util.Scanner;

public class BinaryGap {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		char[] ch = binary.toCharArray();
		boolean start = false;
		int maxGap = 0;
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
		System.out.println(maxGap);
	}

}
