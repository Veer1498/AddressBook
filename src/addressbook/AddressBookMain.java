package addressbook;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		System.out.println("*******************************");
		ContactPerson person = new ContactPerson();
		person.contactDetails();
		person.show();

	}

}
