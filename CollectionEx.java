package in.co.listEX;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		//creates a collecton
		Collection c= new ArrayList();
		
		// add element into collection
		
		c.add("BURA mt dekho ");//index#0
		c.add("bura mt dekho");//index#1
		c.add("bura mt suno");//index#2
		
		System.out.println("length of collection "+c.size());
		
		//print all element of collection 
		for(Object obj :c) {
			System.out.println(obj);
		}
		
		//convert collection into array
		
		Object[] oArray =c.toArray();
		
		// print all element of array
		for(Object obj :oArray) {
			
			String s = (String) obj;
			System.out.println(s);
			
		}
		
		
	}

}
