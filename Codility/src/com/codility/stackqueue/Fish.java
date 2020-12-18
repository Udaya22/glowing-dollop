package com.codility.stackqueue;

import java.util.Stack;

public class Fish {
    public static int solution(int[] a, int[] b) {
        // write your code in Java SE 8
        Stack<Integer> stack=new Stack<Integer>();
        int alive=a.length;
        int top;
        for(int i=0;i<a.length;i++){
            if(b[i]==1){
                stack.push(a[i]);
            }
            else if(b[i]==0){
                while(!stack.isEmpty()){
                    top=stack.peek();
                    if(top>a[i]){
                        alive--;
                        break;
                    }
                    else if(top<a[i]){
                        alive--;
                        stack.pop();
                    }
                }
            }
        }
        return alive;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,5,2,1,4};
		int[] b= {1,0,0,1,0};
		System.out.println(solution(a,b));
	}

}
