package com.codility.sorting;
import java.util.Arrays;

public class DiscIntersection {
	 public static int solution(int[] A) {
	        
	        long[] open = new long[A.length];
	        long[] close = new long[A.length];
	        
	        for(int i=0; i<A.length; i++){
	            open[i] = i - (long)A[i]; // note: lower = center - A[i]
	            close[i] = i + (long)A[i]; // note: upper = center + A[i]
	        }
	        
	        Arrays.sort(open);
	        Arrays.sort(close);
	         
	        int intersection = 0; 
	        int j=0; 
	        int openDisk=0;
	        for(int i=0; i<A.length; i++){
	        	while( j < A.length && close[i] >= open[j]){
	            		intersection+=openDisk;
	            		openDisk++;
	            		j++;
	            }
	            openDisk--;
	        }
	        
	        if(intersection > 10000000)
	            return -1;
	        
	        return intersection;
    }
	public static void main(String[] args) {
		int[] a={1, 5, 2, 1, 4, 0};
		System.out.println(solution(a));
	}


}


/*
i		j		j<6		upper[i]>=lower[j]		intersection
0		0		true	true					0
		1		true	true					1	
		2		true	true					3
		3		true	true					6
		4		true	false					6
1		4		true	true					9
		5		true	false					9
2		5		true	false					9
3		5		true	true					11
4		6		false	
5		6		false		
*/