package com.codility.iteration;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		int next = 0;
		System.out.println(second);
		while(next<13) {
			next = first+second;
			System.out.println(next);
			first = second;
			second = next;
		}
	}

}
