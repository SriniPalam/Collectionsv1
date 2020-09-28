package com.srinipalam.list;

import java.util.HashMap;
import java.util.Map.Entry;

public class SampleHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "srini");
		hm.put(102, "Karthik");
		hm.put(103,"Sai");
		
		System.out.println(hm.get(101));
		System.out.println(hm);
		
		
		System.out.println("printing hash map with Entry and entryset()");
		
		for(Entry e: hm.entrySet())
		{
			System.out.println(e.getKey() +" "+ e.getValue());
		}
		
		hm.remove(102);
		
		System.out.println("printing hash map after removing second key 102");
		System.out.println(hm);
		
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee(101, "Srini",28);
		Employee e2 = new Employee(102, "Jan",30);
		Employee e3 = new Employee(103, "Hero",60);
		
		emp.put(101, e1);
		emp.put(102, e2);
		emp.put(103, e3);
System.out.println("printing the employee class details in map");
		for(Entry<Integer, Employee> e: emp.entrySet())
		{
			Employee emap=e.getValue();
			System.out.println("employee " +e.getKey() +" details");
			System.out.println(emap.eid +" "+emap.ename +" "+ emap.eage);
		}
	}

}
