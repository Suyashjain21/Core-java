package com.assignment.basic;

public class LastName {
	public static void main(String[] args) {
		String n="Vijay Singh Bafun";
		String arr[]=n.split(" ");
		String last=arr[arr.length-1];
		System.out.println(last);
	}

}
