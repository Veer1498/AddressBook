package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Address Book Program
 * @author Veer.Singa
 *
 */

public class AddressBookMain {			
	static ArrayList<ContactPerson> personsList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	//main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		System.out.println("*******************************");
		addContact();
		//editContact();
		deleteContact();
	}
	
	//Option Checking
//	public static void CheckOption() {
//		AddressBookMain book = new AddressBookMain();
//		System.out.println("select options");
//		System.out.println("\n1.AddContact \n2. Edit Contact\n3.Delete Contact");
//		int check = sc.nextInt();
//		switch(check){
//		case 1:
//			addContact();
//			CheckOption();
//			break;
//		case 2:
//			book.editContact();
//			CheckOption();
//			break;
//		case 3 :
//			book.deleteContact();
//			CheckOption();
//			break;
//		}
//	}
	// Contact Adding
	public static void addContact(){

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
	//editing the contact
	public static void editContact() {
		System.out.println("Please Enter the Name You Want to Search For");
		String name = sc.next();
		for(int i = 0; i<personsList.size();i++) {
		if(personsList.get(i).getFirstName().equals(name)) {
			System.out.println("select options");
			System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number");		}
			int option = sc.nextInt();
			switch(option){
			case 1:
				System.out.println("Rename FirstName");
				String editFirstName = sc.next();
				personsList.get(i).setFirstName(editFirstName);
				System.out.println(editFirstName);
				break;
			case 2:
				System.out.print("Enter a Last name:");
				personsList.get(i).setLastName(sc.next());
				break;
			case 3:
				System.out.print("Enter a Address:");
				personsList.get(i).setAddress(sc.next());
				break;
			case 4:
				System.out.print("Enter a city:");
				personsList.get(i).setCity(sc.nextLine());
				break;
			case 5:
				System.out.print("Enter a state:");
				personsList.get(i).setState(sc.nextLine());
				break;
			case 6:
				System.out.print("Enter a zip code:");
				personsList.get(i).setZipNo(sc.nextInt());
				break;
			case 7:
				System.out.print("Enter a phone number:");
				personsList.get(i).setPhoneNo(sc.nextLong());
				break;
			default:
				System.out.println("enter valid contact");
			}
			System.out.println("Details are Edited");
			System.out.println(personsList);
		
		}
	}
	
	//Delete Contact
	public static void deleteContact() {
		System.out.println("Delete Contact");
		System.out.println("confirm the name to delete contact");
		String confirmName = sc.next();
		for (int i = 0; i < personsList.size(); i++) {
			if (personsList.get(i).getFirstName().equals(confirmName))
				;
			ContactPerson person = personsList.get(i);
			personsList.remove(person);
		}
		System.out.println(personsList);
	}
		
}
