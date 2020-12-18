package com.codility.TimeComplexity;

public class MinJump {

	static int jump(int X, int Y, int D) {
        int min = 0;
		Y = Y-X;
		min = Y/D;
		if(Y%D!=0) {
			min+=1;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jump(10,85,30));
	}

}

