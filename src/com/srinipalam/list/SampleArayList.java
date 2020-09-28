package com.srinipalam.list;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArayList {
	
	/* Arraylist 
	Java ArrayList class can contain duplicate elements.
	Java ArrayList class maintains insertion order.
	Java ArrayList class is non synchronized.
	Java ArrayList allows random access because array works at the index basis.
	In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
     */
	public static void main(String []args){
		
		ArrayList al= new ArrayList();
		
		al.add(101);// adding value in array list
		al.add("Srini");
		al.add(10.2);
		al.add('A');
		
		System.out.println(al);// to print object
		System.out.println(al.size());// to check the array size\
		
		System.out.println("printing the al array elements one by one");
		
		for (int i=0; i<al.size(); i++)
		{
			
			System.out.println(al.get(i));// getting the value from array list
		}
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(102);
		al1.add(103);
		al1.add(104);
		
System.out.println("printing the al1 array elements all integers");
		
		for (int i=0; i<al1.size(); i++)
		{
			
			System.out.println(al1.get(i));
		}
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("123");
		al2.add("hi");
		al2.add("hello");
		
	System.out.println("printing the al2 array elements only string");
		
		for (int i=0; i<al2.size(); i++)
		{
			
			System.out.println(al2.get(i));
		}
		
		Employee e1 = new Employee(101,"srini",28);
		Employee e2 = new Employee(102,"Raj",30);
		Employee e3 = new Employee(103,"Nag",32);
		
		ArrayList<Employee> ale = new ArrayList<Employee>();
		ale.add(e1);
		ale.add(e2);
		ale.add(e3);
		
		System.out.println("printing employee objects information");
		Iterator<Employee> it = ale.iterator();
		
		while(it.hasNext())
		{
			System.out.println("********");
			Employee emp =it.next();
			System.out.println(emp.eid);
			System.out.println(emp.ename);
			System.out.println(emp.eage);
			
		}
		
		Employee e4 = new Employee(104,"srini",28);
		Employee e5 = new Employee(105,"venkat",30);
		Employee e6 = new Employee(106,"srikanth",32);
		
		ArrayList<Employee> ale1 = new ArrayList<Employee>();
		ale1.add(e4);
		ale1.add(e5);
		ale1.add(e6);
		
		//adding second ale1 array list in first array list
		//addAll()
		ale.addAll(ale1);// adding all one array list objects to another array list
		
		System.out.println("printing employee objects information after adding second array list ale1");
		Iterator<Employee> it1 = ale.iterator();
		
		while(it1.hasNext())
		{
			System.out.println("********");
			Employee emp1 =it1.next();
			System.out.println(emp1.eid);
			System.out.println(emp1.ename);
			System.out.println(emp1.eage);
			
		}
		
	
		//removeAll()
		
		ale.removeAll(ale1);// removing second array list objects from first array list object
		
		System.out.println("printing array list objects after removing ale1 second object elements");
		Iterator<Employee> it3 = ale.iterator();
		
		while(it3.hasNext())
		{
			System.out.println("********");
			Employee emp2 =it3.next();
			System.out.println(emp2.eid);
			System.out.println(emp2.ename);
			System.out.println(emp2.eage);
			
		}
		//retainAll()// it will save only common objects
		ale.add(e4);
		ale.add(e5);
		ale.retainAll(ale1);
		
			System.out.println("printing common objects information after adding second array list ale1");
			Iterator<Employee> itr = ale.iterator();
			
			while(itr.hasNext())
			{
				//System.out.println("********");
				Employee empr =itr.next();
				System.out.println(empr.eid+","+empr.ename+","+empr.eage);
				//System.out.println(empr.ename);
				//System.out.println(empr.eage);
				
			}
			
	}
}
