package com.exercise.basic;

public class ReverseDigit {

	public static void main(String[] args) {
		int a = 234,r=0;
		
		while(a!=0) {
			int re=a % 10;
		    r=r*10+re;
			a=a/10;
			
		}
		System.out.println(r);
		}

}
