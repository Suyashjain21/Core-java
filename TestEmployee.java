package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws Exception {
		
	
	FileOutputStream fo=new FileOutputStream("D:/object.ser");
	ObjectOutputStream oo=new ObjectOutputStream(fo);
	
	Employee e=new Employee(1, "suyash", "jain");
	oo.writeObject(e);
	oo.close();
	
	System.out.println("Object Successfully Written");
	
	FileInputStream fn=new FileInputStream("D:/object.ser");
	ObjectInputStream oi=new ObjectInputStream(fn);
	
	Employee ee= (Employee) oi.readObject();
	
	System.out.println(ee.getId());
	System.out.println(ee.getFn());
	System.out.println(ee.getLn());
	System.out.println(ee.getPass());
	oi.close();
 }

}
