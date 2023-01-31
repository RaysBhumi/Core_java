package in.co.listEX;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Testmarksheet {
	
	public static void main(String[] args) {
		
		ArrayList Marksheet = new ArrayList();
		//Marksheet m = new Marksheet();
		Marksheet.add(new Marksheet("A1","nan",100));
		Marksheet.add(new Marksheet("A2","bhumi",99));
		Marksheet.add(new Marksheet("A3","nikita",78));
		
		
		//by comparaber
		
		// sort element by comparable
		Collections.sort(Marksheet);
		
		// print all element 
		for(Object o : Marksheet) {
			
			System.out.println(o);
		}
		
		// by comaparator
		// sort element by name 
		Orderbyname cName = new Orderbyname();
		
		Collections.sort(Marksheet,cName);
		
		
		//print all elements
		
		for(Object o :Marksheet) {
			System.out.println(o); 
		}
		
		//sort elements by marks
		
		Orderbymaarks cMarks = new Orderbymaarks();
		
		Collections.sort(Marksheet,cMarks);
		
		System.out.println("-----------------");
		
		   //print all elements 
		
		for(Object o:Marksheet) {
		System.out.println(o);
		}
		
		
	}

}
