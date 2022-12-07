package in.co.rayspro;

public class Constructor {

	private String fname ;
	private String lname ;
	private int id ;
	 
	public String getFname() {
		return fname ;
	}
	
	public String getlname() {
		return lname ;
	}
	
	public int getid() {
		return id ;
	}
	
	public Constructor(String fname, String lname,int id ) {
		this.fname= fname;
		this.lname= lname;
		this.id = id;
	}
	
	
	
	

}
