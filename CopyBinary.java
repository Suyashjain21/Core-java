package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBinary {
	public static void main(String[] args) throws Exception {

		FileInputStream fr = new FileInputStream("D:/medicaps logo.jpg");
		FileOutputStream fw = new FileOutputStream("D:/logo.jpg", true);

		int ch = fr.read();
		while (ch != -1) {
			fw.write(ch);
			ch = fr.read();

		}
		fr.close();
		fw.close();
		System.out.println("Done");
	}
}
