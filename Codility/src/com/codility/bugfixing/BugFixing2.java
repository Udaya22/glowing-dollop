package com.codility.bugfixing;
import java.util.*;

public class BugFixing2 {

	//return the minimal value that occurs in both the arrays
	//if no match found return -1
			int solution(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        for (int k = 0; k < n;) {
	        	//System.out.println(A[k]+" "+B[i]);
	            if (A[k] == B[i])
	                return A[k];
	            if (i < m-1  && B[i] < A[k])
	                i += 1;
	            else
	            	k++;//B[i]>=A[i];
	        }
	        return -1;
	    }
		
		public static void main(String[] args) {
			//int[] B= {6,7};
			//int[] A= {3,4,5,6};
			//with default code for above test case runs into infinite loop
			int[] A = {2,4,6,7};
			int[] B = {2,1,1,7};
			//int[] A = {2, 4, 6, 7};
			//int[] B = {2, 1, 1, 8};
			
			System.out.println(new BugFixing2().solution(A, B));
		}
		
	
}
