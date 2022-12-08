package i.co.Exception;

public class multicatch {

public static void main(String[] args) {
	
	//multiple catch in one try 
	String name = "bhumi";
	
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("string length is too small");
		e.printStackTrace();
		System.out.println(e.getMessage());
		// TODO: handle exception
	}catch (NullPointerException e) {
		System.out.println(" null data or empty data ");
		e.printStackTrace();
		// TODO: handle exception
		System.out.println(e.getMessage());
	}finally {
		System.out.println("this block confirm to excute");
	}
	
	
}


}
