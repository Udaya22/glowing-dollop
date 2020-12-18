package com.codility.iteration;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int r = 0;
		while(n>0) {
			n = n/10;
			r++;
		}
		System.out.println("Number of digits is "+r);
	}

}
