package com.codility.prefixsums;

public class GenomicRangeQuery {
    public static int[] solution(String s, int[] p, int[] q) {
        // write your code in Java SE 8
        String s1="";
        int temp=0;
        int result[]=new int[p.length];
        char[] ch;
        for(int i=0;i<p.length;i++){
            s1=s.substring(p[i],q[i]+1);
            if(s1.contains("A"))
            temp=1;
            else if(s1.contains("C"))
            temp=2;
            else if(s1.contains("G"))
            temp=3;
            else
            temp=4;
            result[i]=temp;
        }
        return result;
    }
	public static void main(String[] args) {
		int[] p={2,5,0};
		int[] q={4,5,6};
		String s="CAGCCTA";
		int result[]=solution(s,p,q);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
