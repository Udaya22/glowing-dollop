package com.codility.iteration;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r = sc.nextInt();
		for(int i = 1; i<=r; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

/*
Enter number of rows
4
1
12
123
1234
*/



/*
n = 4
i	i<=4	j	j<=i	output
1	
*/