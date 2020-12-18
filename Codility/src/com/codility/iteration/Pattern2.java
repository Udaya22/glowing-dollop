package com.codility.iteration;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r = sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<2*r-i-1;j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
Enter number of rows
4
*******
 *****
  ***
   *
*/