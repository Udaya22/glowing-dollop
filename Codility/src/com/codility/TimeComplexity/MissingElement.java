package com.codility.TimeComplexity;

import java.util.Arrays;
import java.util.TreeSet;

public class MissingElement {
	
	static int missing(int[] A) {
        int n = A.length;
        if(n==0)
        return 1;
        n++;
        long sum = 0;
        for(int i:A)
        sum+=i;
        long tsum = (n*(n+1))/2;
        return (int)(tsum-sum); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,3,4,5,9,8,6,2,10};
		System.out.println(missing(a));
	}

}
