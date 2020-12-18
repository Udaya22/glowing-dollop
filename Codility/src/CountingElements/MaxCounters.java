package CountingElements;

import java.util.*;

public class MaxCounters {

    static int[] solution(int n, int[] a) {
        // write your code in Java SE 8
        int counter[] = new int[n];
        int max = 0; 
        for(int i = 0 ; i<a.length; i++){
            if(a[i]<=n){
            counter[a[i]-1]+=1;
            max = Math.max(max,counter[a[i]-1]);
            }
            else{
               Arrays.fill(counter,max);
            }
        }
        return counter;
    }
    
    public int[] solution1(int n, int[] a) {
        // write your code in Java SE 8
        int counter[] = new int[n];
        int min = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<a.length; i++){
            
            if((a[i]-1)<n){
                counter[a[i]-1] = Math.max(min,counter[a[i]-1])+1;
                max = Math.max(max,counter[a[i]-1]);
            }
            if(a[i]>n){
                min = max;
            }
        }
        for(int i = 0; i<n; i++ ){
            counter[i] = Math.max(min,counter[i]);
        }
        return counter;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,4,4,6,1,4,4};
		int count[]=solution(5,a);
		for(int i:count) {
			System.out.println(i);
		}
	}

}
