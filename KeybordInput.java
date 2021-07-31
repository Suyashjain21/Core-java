package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeybordInput {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:/input.txt");
		PrintWriter pw=new PrintWriter(fw);
		System.out.println("Start typing from hear.");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		String line= br.readLine();
	    while (!line.equals("quit")) {
	    	pw.println(line);
	    	line= br.readLine();
			
		}
	    
	    pw.close();
	    ir.close();
	    
	}

}
