package in.co.listEX;

public class TestHashcodeEquals {
	public static void main(String[] args) {
		
		HashcodeEquals h1 = new HashcodeEquals("a1","bhumi",100);
		HashcodeEquals h2 = new HashcodeEquals("a2","nan",89);
		
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		if (h1.hashCode()==h2.hashCode()) {
			
			if(h1.equals(h2)){
				System.out.println("both are equals");
				
			}
		}else {
			
			System.out.println("both are not equals");
		}
		
		
		
		
	}
	

}
