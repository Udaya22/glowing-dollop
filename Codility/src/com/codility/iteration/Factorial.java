package com.codility.iteration;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for(int i = n; i>1; i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}

/*
 for n = 4
 i = 4 --> 4>1 --> fact = fact*4=4
 i = 3 --> 3>1 --> fact = fact*3=12
 i = 2 --> 2>1 --> fact = fact*2=24
 i = 1 --> 1>1(false loop exits) 
*/