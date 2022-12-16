package in.co.listEX;

import java.util.Iterator;
import java.util.LinkedList;

public class flagFast {
	
	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		l.add("bhumi");
		l.add("nandani");
		l.add("savita");
		l.add("nehA");
		 
		Iterator  it = l.iterator();
		 
		while(it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
			l.add("gb");
			l.remove();
		}
		
	}

}
