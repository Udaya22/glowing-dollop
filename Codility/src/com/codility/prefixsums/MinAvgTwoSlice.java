package com.codility.prefixsums;

public class MinAvgTwoSlice {

    public static int solution(int[] a) {
        // write your code in Java SE 8
        float min=Integer.MAX_VALUE;
        float cMin=Integer.MAX_VALUE;
        float avg1=0;
        float avg2=0;
        int minIndex=0;
        for(int i=0;i<a.length-2;i++){
            avg1=(float)(a[i]+a[i+1])/2;
            avg2=(float)(a[i]+a[i+1]+a[i+2])/3;
            cMin=Math.min(avg1,avg2);
            if(min>cMin){
                min=cMin;
                minIndex=i;
            }
        }
        float lavg=(float)(a[a.length-1]+a[a.length-2])/2;
        if(lavg<min)
        minIndex=a.length-2;
        return minIndex;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,7,12,1};
		System.out.println(solution(a));

	}

}
