package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("D:/Hello.txt");
		FileWriter fw=new FileWriter("D:/Written.txt",true);
		
		int ch=fr.read();
		while (ch!=-1) {
			fw.write(ch);
			ch=fr.read();
			
		}
		fr.close();
		fw.close();
		System.out.println("Done");
	}

}
