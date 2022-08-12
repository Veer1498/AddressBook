package addressbook;

import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookMain {			
	static ArrayList<ContactPerson> personsList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		System.out.println("*******************************");
		AddressBookMain book = new AddressBookMain();
		book.addContact();
		
	}
	public void addContact(){

		System.out.println("Plase Enter No of Persons You Want To Add in your Address Book");
		int numOfPersons = sc.nextInt();
		for (int i=0;i<numOfPersons;i++) {
			ContactPerson person1 = new ContactPerson();
				
			System.out.println("Enter a first name:");
			person1.setFirstName(sc.next());

			System.out.println("Enter a last name:");
			person1.setLastName(sc.next());

			System.out.println("Enter a Address:");
			person1.setAddress(sc.next());

			System.out.println("Enter a City name:");
			person1.setCity(sc.next());

			System.out.println("Enter a state:");
			person1.setState(sc.next());

			System.out.println("Enter a zip code:");
			person1.setZipNo(sc.nextInt());

			System.out.println("Enter a phone number:");
			person1.setPhoneNo(sc.nextLong());
			System.out.println("===================================");
			personsList.add(person1);
		}
			System.out.print(personsList);
			
	}
		
}
