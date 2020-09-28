package com.srinipalam.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class SampleArrayListPrintingValues {
	
	public static void main(String []args){
	ArrayList<String> al = new ArrayList<String>();
	
	al.add("Julai");
	al.add("RGV");
	al.add("SuperHeros");
	
	//1. printg values with foreach and lambda expression
	System.out.println("printg values with iterator and lambda expression");
	al.forEach(mv->{
		System.out.println(mv);
	});
	
	//2. printg values with Iterator 
	System.out.println("printg values with iterator only");
	
		 Iterator<String> it = al.iterator();
		 
		 while(it.hasNext())
		 {
			 
			 System.out.println(it.next());
		 }
		//3. printg values with Iterator and lambda
		 
		 System.out.println("printg values with iterator , foreachremaining and lambda");
			
		 it = al.iterator();
		 it.forEachRemaining(mvs->{
			 
			 System.out.println(mvs);
		 });
		 
		 
		 //4. using simple foreach loop
		 System.out.println("printg values using simple foreach loop");
			
		
		
		
		for(String s:al)
		{
			 System.out.println(s);
		
		}
		 //5. using simple for loop and index order
		 System.out.println("printg values using simple for loop and index order");
			
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		// using the listIterato to pring in reverse order
		
		 System.out.println("printg values using list iterato for revers order");
			
		ListIterator<String> lits = al.listIterator(al.size());
		
		while(lits.hasPrevious())
		{
			//String ss = lits.previous();
			//System.out.println(ss);
			
			System.out.println(lits.previous());
		}
		 
	}

}
