package com.assignment.basic;

import java.util.Random;

public class GenerateOTP {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i=1;i<=5;i++) {
			int a = r.nextInt(9);
			System.out.print(a);
		}
	}

}
