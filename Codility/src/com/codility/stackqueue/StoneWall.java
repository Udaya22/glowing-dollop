package com.codility.stackqueue;

import java.util.Stack;

public class StoneWall {
	  public static int solution(int[] a) {
	        // write your code in Java SE 8
	        Stack<Integer> stack=new Stack<Integer>();
	        stack.push(a[0]);
	        int blocks=0;
	        int top=0;
	        for(int i=1;i<a.length;i++){
	        	//System.out.println(i+"  "+a[i]);
	            if(a[i]>stack.peek()){
	                stack.push(a[i]);
	            }
	            else if(a[i]<stack.peek()){
	                while(!stack.empty()&&a[i]<stack.peek()){
	                top=stack.pop();
	                blocks++;
	                }
	                if(!stack.empty()&&stack.peek()==a[i])
	                	stack.pop();
	                stack.push(a[i]);
	            }
	            //System.out.println(stack);
	        }
	        while(!stack.isEmpty()){
	            stack.pop();
	            blocks++;
	        }
	        return blocks;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8, 8, 5, 7, 9, 8, 7, 4, 8};
		System.out.println(solution(a));

	}

}


/*i		a[i]	a[i]>top	a[i]<top	stack		blocks
  0		8		  -           -         [8]			0
  1		8		false		false		[8]			0
  2		5		false		true		[5]			1
  3		7		true		false		[5,7]		1
  4		9		true		false		[5,7,9]		1
  5		8		false		true		[5,7]		2
  				true		false		[5,7,8]		2
  6		7		false		true		[5,7]		3
  				false		false		[5,7]		3
  7		4		false		true		[5]			4
  				false		true		[4]			5
  8		8		true		false		[4,8]		5
  
  stack		stack.Empty		stack.pop()		blocks
  [4,8]		false			8				6
  [4]		false			4				7
  []		true
  
  blocks=7
  
*/