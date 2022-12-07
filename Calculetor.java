package in.co.rayspro;

public class Calculetor {
    
	public static void main(String[]args) {
	// calculator by if else
		
		int x = 6;
		int y = 7;
		int choice = 5;// for excute any command
		  
		if (choice ==1) {
			int add = x+y;
			System.out.println("the addition is " + add);	
		}
		else if(choice == 2){
			int sub = x-y;
			System.out.println("the subtraction is " + sub);
		}
		else if (choice==3) {
			int multi = x*y;
			System.out.println("the multiplication  is " + multi);
		}
		else if(choice== 4) {
			int divide = x/y;
			System.out.println("the division  is " + divide);
		}
		else {
			System.out.println("enter valiad choice");
			
		}
		}
			  
}
