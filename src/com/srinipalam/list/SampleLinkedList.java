package com.srinipalam.list;

import java.util.LinkedList;

public class SampleLinkedList {

	private static final String Iterator = null;

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<String>();
		
		//add()// to add the elements in linkedlist array
		ll.add("Srini");
		ll.add("Raj");
		ll.add("Java");
				
		System.out.println(ll);//[Srini, Raj, Java]
		
		// how to set the first element
		
		ll.addFirst("this is first");
		ll.addLast("this is last element");
		System.out.println(ll);//[this is first, Srini, Raj, Java, this is last element]
		
		ll.set(0, "set 0 index");
		System.out.println(ll);//[set 0 index, Srini, Raj, Java, this is last element]

		ll.removeFirst();
		ll.removeLast();//[Srini, Raj, Java]
		
		ll.remove(0);
		System.out.println(ll);//[Raj, Java]
		System.out.println(ll.size());//2
		
		// printing values from Linkedlist
		
		//for loop
		
		System.out.println("printing for loop output");
		for (int i=0; i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		// for each loop/ advanced for loop
		
		System.out.println("printing for each loop output");
		for (String str:ll)
		{
			System.out.println(str);
		}
		
		// iterator 
		
		System.out.println("printing iterator output");
		
		java.util.Iterator<String> it = ll.iterator();
		
		while(it.hasNext())
		{
			//System.out.println("********");
			//String empr =;
			System.out.println(it.next());
			
			
		}
		
		System.out.println("printing while loop output");
		int j=0;
			while(ll.size()>j)
			{
				System.out.println(ll.get(j));
				j++;
			}
		System.out.println(" git push");
		
		
	}

}
