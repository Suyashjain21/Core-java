package com.io;

import java.io.File;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) {
		File f=new File("D:/Hello.txt");
		if (f.exists()) {
			System.out.println("File name "+f.getName());
			System.out.println("Absolute path "+f.getAbsolutePath());
			System.out.println("Parent path "+f.getParent());
			System.out.println("Is readable "+f.canRead());
			System.out.println("Is writable "+f.canWrite());
			System.out.println("Is Directory "+f.isDirectory());
			System.out.println("Is file "+f.isFile());
			System.out.println("Length is "+f.length()+" bytes long");
			System.out.println("Last modified at "+new Date(f.lastModified()));
		}
	}

}
