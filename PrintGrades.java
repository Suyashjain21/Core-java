package com.assignment.basic;

public class PrintGrades {
	public static void main(String[] args) {
		int a=75;
		
		if(a<100 && a>91) {
			System.out.println("Grade is A++");
		}
		else if(a<90 && a>81) {
			System.out.println("Grade is A");
		}
		else if(a<80 && a>71) {
			System.out.println("Grade is B++");
		}
		else if(a<70 && a>61) {
			System.out.println("Grade is B");
		}
		else {
			System.out.println("Grade is Second Division");
		}
	}

}
