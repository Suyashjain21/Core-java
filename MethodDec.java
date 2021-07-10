package com.assignment.basic;

public class MethodDec {
	public static void main(String[] args) {
		int a =  div(args);
		System.out.println(a);
	}

	public static int div(String[] args) {
		int a = Integer.parseInt(args [0]);
		int b = Integer.parseInt(args [1]);
		int c = a/b;
		return c;
		
		
		
		
	}

}
