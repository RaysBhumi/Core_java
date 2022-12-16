package in.co.listEX;

public class Marksheet implements Comparable<Marksheet> {
	
	
		 public String Name; 
		 public String rollno;
		 public int marks;
		 
		 //to set the data
   public Marksheet(String name, String rollno,int marks) {
	   
	   super();
	   this.Name=Name;
	   this.rollno = rollno;
	   this.marks = marks;
   }	 
			
	
	//to gate the data
	@Override
     public String toString() {
	return "Marksheet [Name=" + Name + ", rollno=" + rollno + ", marks=" + marks + "]";
     }


// to compare 
	@Override
	public int compareTo(Marksheet m) {
		// TODO Auto-generated method stub
		return rollno.compareTo(m.rollno);
	}
	

}
