package in.co.listEX;

import java.util.Comparator;

public class HashcodeEquals implements Comparable<HashcodeEquals> {

	
	  String rollno;
	 public String Name;
	 public int marks ;
	 
	 public HashcodeEquals(String rollno ,String name , int marks ) {
		 
		 
		  this .rollno =rollno;
		  this.Name = Name;
		  this .marks = marks;
	 }
	 
	 public boolean equals(Object o) {
		 
		 if(o== null)
			 return false;
		 if(!(o instanceof HashcodeEquals ))
			 return false;
		 
		 HashcodeEquals other = (HashcodeEquals) o;
		 return this .rollno.contentEquals(other.rollno);
	 }
		 
@Override
	public String toString() {
		return "HashcodeEquals [rollno=" + rollno + ", Name=" + Name + ", marks=" + marks + "]";
	}

@Override
public int compareTo(HashcodeEquals o) {
	return rollno.compareTo(o.rollno);
}	
}


