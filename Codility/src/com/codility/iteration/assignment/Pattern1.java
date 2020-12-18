package com.codility.iteration.assignment;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i = 0; i<=row; i++) {
			for(int j = 1;j<row-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
