package mobilePhone;

public class StarterPhone {

	public static void main(String[] args) throws Exception {
		Contacts c1 = new Contacts("Contact01", "00050");
		Contacts c2 = new Contacts("Contact02", "00051");
		Contacts c3 = new Contacts("Contact03", "00052");

		MobilePhone.addContact(c1);
		MobilePhone.addContact(c2);
		MobilePhone.addContact(c3);

		MobilePhone.printContacts();
	//	MobilePhone.removeContact(c1);
		MobilePhone.removeContact(c1);
	}

}
