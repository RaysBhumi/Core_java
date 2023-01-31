package in.co.listEX;

import java.util.Comparator;

public class Orderbyname implements Comparator<Marksheet>{

	
	
	
	//compare marksheet by name in ascending order
	
	public int compare(Marksheet m1,Marksheet M2) {
		
		return m1.Name.compareTo(M2.Name);
		
	}
	
}
