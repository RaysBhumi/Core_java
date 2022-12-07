package in.co.rayspro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCal {
	//give current date  in java
	public static void main(String[] args) throws Exception {
		
	Date d = new Date();
	System.out.println(d);
	//date formating into our formate
	SimpleDateFormat Sdf = new SimpleDateFormat("dd/mm/yyyy");
	String str = Sdf.format(d);
    System.out.println(str);
	
	// parsing date into java format
	
	String a = "07/12/2022";
	System.out.println (a);
	
	Date d1= Sdf.parse(a);
	System.out.println(d1);
}
}