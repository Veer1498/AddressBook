package addressbook;
import java.util.Scanner;
/**
 * AddressBook Program
 * @author Veer.Singa
 *
 */

//Main Class Containing Main Function
public class AdressBookMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		System.out.println("*******************************");
		AddressBook addressbook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\nAddressBook Options ");
			System.out.println("\n1.AddContact \n2.Edit Contact\n3.Delete Contact\n4.Number of Saved Contact\n5.Display\n6.Close AddressBook");
			int check = sc.nextInt();
			switch(check){
			case 1:
				addressbook.addContact();
				break;
			case 2:
				addressbook.editContact();
				break;
			case 3 :
				addressbook.deleteContact();
				break;
			case 4 :
				addressbook.numOfContacts();
				break;
			case 5 :
				addressbook.display();
				break;
			case 6 :
				System.exit(0);
				
			}
		}
	}	
}
