package in.co.listEX;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
	
		ArrayList a = new ArrayList();
		
		a.add("zero");//index#0
		a.add("one");//index#1
		a.add("two");//index#2
		a.add("three");//index#3
		a.add("four");//index#4
		
		//get an element by index
		String val = (String)a.get(3) ;
		System.out.println(val);
		
		//print all elements
	for(int i = 0;i<a.size();i++) {
		
		System.out.println(i+":"+a.get(i));
		
	}
		
	for(Object obj:a) {
		System.out.println(obj);M
	}
	
	// and integer in the collection

		
		  Integer i = new Integer(4); a.add(i); System.out.println(a);
		 
	
	ArrayList sublist =new ArrayList(a.subList(0, 3));
	
	System.out.println(sublist);
	
	
	
		
	}

}
