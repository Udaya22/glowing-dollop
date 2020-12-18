package com.codility.arrays;

import java.util.Scanner;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 8, 9, 7, 6};
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		//if(n==0)
	      //  return arr;
	        k = k%n;
			int rev[] = new int[n];
			int j = 0;
			for(int i = n-k; i<n; i++) {
				rev[j++] = arr[i];
			}
			for(int i = 0; i < n-k; i++) {
				rev[j++] = arr[i];
			}
		for(int i = 0;i<n;i++) {
			System.out.println(rev[i]);
		}
	}

}


