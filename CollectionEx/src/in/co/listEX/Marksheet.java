package in.co.listEX;

public class Marksheet implements Comparable<Marksheet> {
	
	
		 public String rollno; 
		 public String Name;
		 public int marks;
		 
		 //to set the data
   public Marksheet(String rollno, String name,int marks) {
	   
	   super();
	   this.rollno=rollno;
	   this.Name = name;
	   this.marks = marks;
   }	 

	@Override
public String toString() {
	return "Marksheet [rollno=" + rollno + ", Name=" + Name + ", marks=" + marks + "]";
}










	// to compare 
	@Override
	public int compareTo(Marksheet m) {
		// TODO Auto-generated method stub
		return rollno.compareTo(m.rollno);
	}
	

}
