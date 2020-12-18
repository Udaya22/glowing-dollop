package com.codility.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,17,22,9,1};
		int min=0;
		int temp;
		for(int i=0;i<a.length-1;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min])
					min=j;
			}
			temp = a[i];
			a[i] = a[min];
			a[min]= temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
