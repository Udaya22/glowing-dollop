package com.codility.TimeComplexity;

public class TapeEquilibrium {

	static int equi(int[] a) {
		int n = a.length;
		int min = Integer.MAX_VALUE;
		int p1 = 0;
		int p2 = 0;
		int s=0;
		for(int i=0; i<n; i++ ){
			s+=a[i];
		}
		for(int p=1; p<n; p++) {
			p1 += a[p-1];
			p2 = s - p1;
			min = Math.min(min,Math.abs(p1-p2));
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,1,2,4,3}; 
		System.out.println(equi(a));
	}

}
