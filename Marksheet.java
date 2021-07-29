package com.collection;



/**
 * @author suyash 
 *
 */
public class Marksheet implements Comparable<Marksheet> {
	private String rollNo;
	private String name;
	private String lname;
	private int physics;
	private int chemistry;
	private int maths;
	
	/*
	 * public boolean equals(Object o) {
	 * 
	 * if(o == null) return false; if(!(o instanceof Marksheet)) return false;
	 * 
	 * 
	 * 
	 * Marksheet other =(Marksheet) o; return
	 * this.getRollNo().equals(other.getRollNo()); }
	 * 
	 * public int hashCode() { return rollNo.hashCode();
	 */
	//}
	
	
	
	public String getRollNo() {
		return rollNo;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	
	
	@Override
	public String toString() {
		return "Marksheet [rollNo=" + rollNo + ", name=" + name + ", lname=" + lname + ", physics=" + physics
				+ ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}
	@Override
	public int compareTo(Marksheet o) {
		// TODO Auto-generated method stub
		return this.rollNo.compareTo(rollNo);
	}
	

}
