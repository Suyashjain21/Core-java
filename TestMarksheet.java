package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author suyash
 *
 */
public class TestMarksheet extends NameUse {
	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();
		m1.setRollNo("101");
		m1.setName("lucky");
		m1.setLname("rajpoot");
		m1.setPhysics(87);
		m1.setChemistry(98);
		m1.setMaths(90);

		Marksheet m2 = new Marksheet();
		m2.setRollNo("102");
		m2.setName("suyas");
		m2.setLname("baragi");
		m2.setPhysics(56);
		m2.setChemistry(78);
		m2.setMaths(98);

		Marksheet m3 = new Marksheet();
		m3.setRollNo("103");
		m3.setName("lucky");
		m3.setLname("patidar");
		m3.setPhysics(33);
		m3.setChemistry(33);
		m3.setMaths(33);

		Marksheet m4 = new Marksheet();
		m4.setRollNo("104");
		m4.setName("lucky");
		m4.setLname("jain");
		m4.setPhysics(76);
		m4.setChemistry(79);
		m4.setMaths(54);

		List<Marksheet> l = new ArrayList<Marksheet>();

		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);

		/*
		 * System.out.println(l);
		 * 
		 * 
		 * System.out.println(l.contains(m4));
		 * 
		 * HashMap map= new HashMap(); map.put(1, m1); System.out.println(map);
		 */
		Collections.sort(l, new NameUse());

		Iterator<Marksheet> it = l.iterator();
		while (it.hasNext()) {
			Object m = (Object) it.next();
			System.out.println(m);

		}
	}

}
