package addressbook;

import java.util.Scanner;

public class ContactPerson {
	String firstName;
	String lastName;
	String address;
	 String city;
	String state;
	int zipNo;
	long phoneNo;
	
	static Scanner sc = new Scanner(System.in);
	
		
		
	public void contactDetails() {
		System.out.println("Enter firstName");
		firstName =sc.next();
		
		System.out.println("Enter LastName");
		lastName =sc.next();
		
		System.out.println("Enter Address");
		address =sc.next();
		
		System.out.println("Enter City");
		city =sc.next();
		
		System.out.println("Enter State");
		state =sc.next();
		
		System.out.println("Enter Zip");
		zipNo =sc.nextInt();
		
		System.out.println("Enter phoneNumber");
		phoneNo =sc.nextLong();
	}
	
	public void show() {
		System.out.println( "\nPerson Details\n" );
		System.out.println("FirstName = "+ firstName);
		System.out.println("Address   = "+ address);
		System.out.println("city      = "+ city);
		System.out.println("state     = "+ state);
		System.out.println("zip       = " +zipNo);
		System.out.println("phnNumber = " + phoneNo);
	}
	
	

}
