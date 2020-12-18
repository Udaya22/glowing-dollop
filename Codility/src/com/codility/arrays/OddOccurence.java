package com.codility.arrays;

public class OddOccurence {

	static int unpaired(int a[]) {
		int x = 0;
		for(int i:a) {
			x = x ^ i;
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,5,4,3,2,1};
		System.out.println(unpaired(a));
	}

}

/*
i	x
1	1
2	3
3	0
4	4
5	1
6	7
5	2
4	6
3	5
2	7
1	6
*/