package mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
	private static ArrayList<Contacts> contacts;

	static{
		contacts = new ArrayList<Contacts>();
	}

	public static void printContacts() {
	 for(Contacts c : contacts) {
		 System.out.print(c.getName()+" ");
	 }
	}

	public static void addContact(Contacts contact) throws Exception {
		if (!findContact(contact)) {
			contacts.add(contact);
		} else {
			throw new Exception("Contact is already in the list!");
		}

	}

	public static boolean updateContact(Contacts oldContact, Contacts newContact) throws Exception {
		int index = findIndexContact(oldContact);
		if(index>=0) {
			contacts.add(index, newContact);
			return true;
		}else {
			throw new Exception("No such element in the list!");
		}
	}
	
	private static int findIndexContact(Contacts c) {
		return contacts.indexOf(c);
	}

	private static boolean findContact(Contacts c) {
		return contacts.contains(c);
	}

	public static void removeContact(Contacts c) throws Exception {
		int index = findIndexContact(c);
		if(index>=0) {
			contacts.remove(index);
		}else {
			throw new Exception("No such element in the list!");
		}
	}
}
