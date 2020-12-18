package com.codility.prefixsums;

public class CountDiv {
    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int s1 = (A-1)/K;
        int s2 = B/K;
        int sum = s2-s1;
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(6,11,2));

	}

}
