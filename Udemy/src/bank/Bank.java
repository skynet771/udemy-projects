package bank;

import java.util.ArrayList;

public class Bank {
	private static ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public static void main(String[] args) {
		Customer c1 = new Customer("Peter", 55.0);
		Branch b = new Branch();
		b.addCustomer(c1);
		b.addTransaction("Peter", 101.0);
		b.printTransactionsForClient("Peter");
		branches.add(b);
	}
	
}
