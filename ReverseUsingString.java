package com.assignment.basic;


public class ReverseUsingString {
	public static void main(String[] args) {
		String n= "Vijay Singh Chouhan";
		
		for(int i=n.length();i>0;i--) {
			System.out.print(n.charAt(i-1));
		}
		
	}

}
