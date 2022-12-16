package in.co.listEX;

import java.util.Enumeration;
import java.util.Vector;

public class Enumrationex {
	
	public static void main(String[] args) {
		
		int i = 2;
		Vector v= new Vector(i);
		
		v.add("ram");
		v.add("shyam"); 
		
		Enumeration  e =  v.elements();
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
			if(i==2) {
				//v.add("raman");
				v.remove(0);
				
			}
		}
		System.out.println(v);
				
		
	}

}
