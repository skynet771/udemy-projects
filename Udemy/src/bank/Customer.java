package bank;

import java.util.ArrayList;

public class Customer {
	private ArrayList<Double> transactions;
	private String name;
	
	{
		transactions = new ArrayList<Double>();
	}
	
	
	
	public ArrayList<Double> getTransactions() {
		return transactions;
	}



	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}



	public String getName() {
		return name;
	}

	public void printTransactions() {
		 
		for(Double d : transactions) {
			System.out.println("Amount:"+d);
			 
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addTransaction(Double transaction) {
		this.transactions.add(transaction);
	}

	public Customer(String name, Double transactions) {
		this.name = name;
		this.transactions.add(transactions); 
	}
}
