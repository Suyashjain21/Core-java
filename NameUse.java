package com.collection;


import java.util.Comparator;

/**
 * @author suyash
 *
 */
public class NameUse extends Marksheet implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2)    {
        
		if (o1.getName().equals(o2.getName())==true) {
			return o1.getLname().compareTo(o2.getLname());
		} 
		else {
			return o1.getName().compareTo(o2.getName());
		}
		
	}

}
