package i.co.Exception;

public class TestloginException extends Exception {
	
	public static void main(String[] args)  throws LoginException {//exception class 
		
		TestloginException t = new TestloginException(); // object for call method 
		 
		try {
			t.authenticate("admi");//when the exception is create it goes to catch block
		 System.out.println("no exceptin found ");
		    }
	   
		
		  catch (LoginException e) {//if the catch  is not found it goes to parent clas
		  
		  System.out.println("user acces denied"); // TODO: handle exception 
		 
		  }
	    finally {
					
					
					System.out.println( "fianl block");
				}		
		
	}
	
	public void authenticate( String name) throws LoginException{
		
		if(!"admin".equals(name)) {
			LoginException e = new LoginException();
			throw e;		
			
			
		}
		
		
	}
	
	

}
