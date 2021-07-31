package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public static void main(String[] args) throws Exception {
		
		FileWriter fw=new FileWriter("D:/Written.txt");
		PrintWriter pw=new PrintWriter(fw);
		
		//for (int i = 0; i < 5; i++) {
			pw.println(" Line");
			pw.println("is");
			pw.println("visible");
		
		pw.close();
	}

}
