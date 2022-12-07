package in.co.rayspro;

public class AccountTest {
	public static void main(String[] args) {
		
		 AccountEx ac= new AccountEx();
		 ac.setName("bhumi");
		 ac.setType("saving account");
		 
         
		 
		 String n= ac.getName();
		 System.out.println(n);
         String t= ac.getType();
         System.out.println(t);
         int b= ac.getbalance();
         System.out.println(b);
       
}
}g