package com.srinipalam.list;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class SampleHashtable {

	public static void main(String[] args) {
	
		Hashtable ht = new Hashtable();
		
		ht.put(101, "Srini");
		ht.put(102, "Jan");
		ht.put(103, "Goa");
		
		Hashtable ht1 = new Hashtable();
		
		ht1=(Hashtable)ht.clone(); // cloning the data from one object to another object
		
		System.out.println(ht); //{103=Goa, 102=Jan, 101=Srini}
		System.out.println(ht1);//{103=Goa, 102=Jan, 101=Srini}
		
		ht.clear(); // clearing the data from hashtable object
		
		System.out.println(ht);//{}
		System.out.println(ht1);//{103=Goa, 102=Jan, 101=Srini}
		
		Hashtable hs = new Hashtable();
		
		hs.put('A', "Apple");
		hs.put('B', "Ball");
		hs.put('C', "Cat");
		
		if(hs.containsValue("Cat"))
		{
			System.out.println(" hash table hs has cat value");
		}
		
		// enumeration
		System.out.println(" printing hashtable values with enumeration");
		
	Enumeration er = hs.elements();
	
	while(er.hasMoreElements())
	{
		System.out.println(er.nextElement());
	}
		
	System.out.println(" printing hashtable values with entryset");
	
	Set s =hs.entrySet();
	
	System.out.println(s);
	
	Hashtable hs1 = new Hashtable();
	
	hs1.put('A', "Apple");
	hs1.put('B', "Ball");
	hs1.put('C', "Cat");
	
	if(hs.equals(hs1))// equall method to check both objects are same or not
	{
		System.out.println("both hashtables hs, hs1 are equall");
	}
	
	// get the value from specific key
	
	System.out.println(hs1.get('A'));
	
	// get the hascode of hashtable 
	
	System.out.println(hs.hashCode());
	
	System.out.println(hs1.hashCode());
	
	}

}
