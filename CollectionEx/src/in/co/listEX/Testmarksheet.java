package in.co.listEX;

import java.util.ArrayList;
import java.util.Collections;

public class Testmarksheet {
	
	public static void main(String[] args) {
		
		ArrayList Marksheet = new ArrayList();
		//Marksheet m = new Marksheet();
		Marksheet.add(new Marksheet("A1","nandani",100));
		Marksheet.add(new Marksheet("A2","bhumi",99));
		Marksheet.add(new Marksheet("A3","nikita",78));
		
		// sort element by comparable
		Collections.sort(Marksheet);
		
		// print all element 
		for(Object o : Marksheet) {
			
			System.out.println(o);
		}
		
	}

}
