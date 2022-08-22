package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Address Book Program
 * @author Veer.Singa
 *
 */

//AddressBook Class for Managing Different Operations
public class AddressBook {			
	 ArrayList<ContactPerson> personsList = new ArrayList<>();
	 Scanner sc = new Scanner(System.in);
	public  int count = 0;
	
	//Adding Contact into AddressBook
	public void addContact(){
		
			ContactPerson contact = new ContactPerson();
			count++;
			System.out.println("Enter Details to Add Contact\n");
			System.out.println("Enter a first name:");
			contact.setFirstName(sc.next());

			System.out.println("Enter a last name:");
			contact.setLastName(sc.next());

			System.out.println("Enter a Address:");
			contact.setAddress(sc.next());

			System.out.println("Enter a City name:");
			contact.setCity(sc.next());

			System.out.println("Enter a state:");
			contact.setState(sc.next());

			System.out.println("Enter a zip code:");
			contact.setZipNo(sc.nextInt());

			System.out.println("Enter a phone number:");
			contact.setPhoneNo(sc.nextLong());
			System.out.println("===================================");
			personsList.add(contact);
			System.out.println("Contact Added to AddressBook");
	}
	
	//Editing the contact of AddressBook
	public void editContact() {
		
		System.out.println("Please Enter the Name You Want to Search For");
		String name = sc.next();
		for(int i = 0; i<personsList.size();i++) {
			ContactPerson contact = personsList.get(i); //Shallow Copying Data for Thread Safe
			if(contact.getFirstName().equals(name)) {
				System.out.println("select options");
				System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number");		}
				int option = sc.nextInt();
				switch(option){
				case 1:
					System.out.println("Enter FirstName");
					contact.setFirstName(sc.next());
					break;
				case 2:
					System.out.print("Enter a Last name:");
					contact.setLastName(sc.next());
					break;
				case 3:
					System.out.print("Enter a Address:");
					contact.setAddress(sc.next());
					break;
				case 4:
					System.out.print("Enter a city:");
					contact.setCity(sc.nextLine());
					break;
				case 5:
					System.out.print("Enter a state:");
					contact.setState(sc.nextLine());
					break;
				case 6:
					System.out.print("Enter a zip code:");
					contact.setZipNo(sc.nextInt());
					break;
				case 7:
					System.out.print("Enter a phone number:");
					contact.setPhoneNo(sc.nextLong());
					break;
				default:
					System.out.println("enter valid contact");
				}
				System.out.println("\nDetails are Edited");
			}
		}
	
	//Delete Contact of AddressBook
	public void deleteContact() {
		
		System.out.println("Delete Contact");
		System.out.println("confirm the name to delete contact");
		String confirmName = sc.next();
		for (int i = 0; i < personsList.size(); i++) {
			ContactPerson contact = personsList.get(i); //Shallow Copying Data for Thread Safe
			if (contact.getFirstName().equals(confirmName))
			personsList.remove(contact);
		}
		count--;
	}
	
	//To Display All Contacts of AddressBook
	public void display() {
		for (int i = 0; i < personsList.size(); i++) {
			ContactPerson contact = personsList.get(i);//Shallow Copying Data for Thread Safe
			System.out.println(contact);
		}
	}
	
	//Number of Contacts Present in AddressBook
		public void numOfContacts() {
			System.out.println("The Contacts Saved in Book : "+count);
		}
		
}
