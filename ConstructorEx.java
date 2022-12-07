package in.co.rayspro;

public class ConstructorEx {
	public static void main(String[] args) {
		
		Constructor c = new Constructor("bhumi","sharma",1);
		
		String fn = c.getFname();
		System.out.println(fn);
		
		String ln = c.getlname();
		System.out.println(ln);
		
		int  id = c.getid();
		System.out.println(id);
	
		
	}

}