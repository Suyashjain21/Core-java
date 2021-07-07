package com.exercise.basic;

public class DivisibleBySeven {
	public static void main(String[]args) {
		int a=196;
		int b=105;
		int n=1,sum=0;
		while(n/7==0)
		{
		n=((a-b)/7)+1;
		sum=(n/2)*(a+b);
		int d=sum*7;
		System.out.println(n);
		System.out.println(sum);
		}
	}

}
