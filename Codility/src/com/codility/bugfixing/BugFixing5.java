package com.codility.bugfixing;

public class BugFixing5 {
	//return the element which occurs the maximum no of times in the given array A
	//M indicates the max value of any element in the array
	int solution(int M, int[] A) {
		int N = A.length;
		int[] count = new int[M + 1];
		for (int i = 0; i <= M; i++)
			count[i] = 0;
		int maxOccurence = 0;
		int index = 0;
		for (int i = 0; i < N; i++) {
			if (count[A[i]] > 0) {
				int tmp = count[A[i]]+1;
				if (tmp >= maxOccurence) {
					maxOccurence = tmp;
					index = i;
				}
				count[A[i]] = tmp;
			} else {
				count[A[i]] = 1;
			}
			for(int j=0;j<M+1;j++)
			System.out.print(count[j]);
			System.out.println();
		}
		return A[index];
	}
	
	public static void main(String[] args) {
		System.out.println(new BugFixing5().solution(4, new int[] {1,1,2,2,3,3}));
		System.out.println(new BugFixing5().solution(6, new int[] {1,2,5,5}));
		System.out.println(new BugFixing5().solution(4, new int[] {1,2,3,4}));
		//System.out.println(new BugFixing5().solution(5, new int[] { 1, 2, 3, 3, 3, 4, 4, 3, 2}));
	}

}
