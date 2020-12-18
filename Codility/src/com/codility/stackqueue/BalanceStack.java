package com.codility.stackqueue;

import java.util.Stack;

public class BalanceStack {
    public static int solution(String s) {
        // write your code in Java SE 8
        String open="[{(";
        String close="]})";
        Stack<Character> stack=new Stack<>();
        char c1;
        //char[] ch=S.toCharArray
        int ind1,ind2;
        for(int i=0;i<s.length();i++){
        	//System.out.println(s.charAt(i)+" "+i);
            ind1=open.indexOf(s.charAt(i));
            ind2=close.indexOf(s.charAt(i));
            if(ind1>ind2){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty())
                return 0;
            	c1=open.charAt(close.indexOf(s.charAt(i)));
                char peek=stack.peek();
                if(peek!=c1){
                	return 0;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return 1;
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{[()()]}";
		System.out.println(solution(s));
	}

}
