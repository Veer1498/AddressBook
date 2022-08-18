package addressbook;

public class ContactPerson {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipNo;
	private long phoneNo;
	
	public ContactPerson() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipNo() {
		return zipNo;
	}
	public void setZipNo(int zipNo) {
		this.zipNo = zipNo;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "\n PERSON DETAILS \n firstName = " + firstName + " \n lastName = " + lastName 
				+ "\n address = " + address + "\n city = "
				+ city + "\n state = " + state + "\n zipNo = " + zipNo 
				+ "\n phoneNo = " + phoneNo+"\n-Successfully done Operation of "+firstName+" in AddressBook\n";
	}

	
	

}
