package com.codility.iteration;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r = sc.nextInt();
		for(int i = 1; i<=r; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}

/*
Enter number of rows
4
1
22
333
4444
*/