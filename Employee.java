package com.io;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String fn;
	private String ln;
	private transient String pass;

	public Employee() {

	}

	public Employee(int a, String b, String c) {
              id=a;
              fn=b;
              ln=c;
	}

	public int getId() {
		return id;
	}

	public String getFn() {
		return fn;
	}

	public String getLn() {
		return ln;
	}

	public String getPass() {
		return pass;
	}
	
}
