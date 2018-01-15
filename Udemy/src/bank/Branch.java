package bank;

import java.util.ArrayList;

public class Branch {
	private ArrayList<Customer> customers;
	
	{
		customers = new ArrayList<Customer>();
	}
	
	public boolean addCustomer(Customer c) {
		int index = findCustomer(c);
		if(!(index>=0)) {
			customers.add(c);
			System.out.printf("Customer: %s was added to the list!%n", c.getName());
			return true;
		}
		
		return false;
	}
	
	public void addTransaction(String name, Double amount) {
		int index = findCustomerByName(name);
		if(index>=0) {
			customers.get(index).addTransaction(amount);
			System.out.printf("Amount of: %.2f added successfully to the transaction list!%n", amount);
		}else {
			System.out.println("Cant find such customer!");
		}
	}
	
	public void printTransactionsForClient(String name) {
		int index = findCustomerByName(name);
		if(index>=0) {
			 customers.get(index).printTransactions();
		}else {
			System.out.println("Cant find such customer!");
		}
	}
	
	private int findCustomerByName(String name) {
		for(Customer c : customers) {
			if(c.getName().equals(name)) {
				return findCustomer(c);
			} 
		}
		System.out.println("No such customer");
		return -1;
	}
	
	private int findCustomer(Customer c) {
		return customers.indexOf(c);
	}
	
}
