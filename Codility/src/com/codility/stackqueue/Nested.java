package com.codility.stackqueue;

import java.util.Stack;

public class Nested {
	public static int solution(String s) {
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				stack.push('(');
			}
			if(stack.empty()) {
				return 0;
			}
			else {
				if(stack.peek()=='(') {
					stack.pop();
				}
				else {
					return 0;
				}
			}
		}
		if(stack.empty())
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
