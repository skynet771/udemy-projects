package burgers;

public class Burger {
	private String rollType;
	private boolean meat;
	protected int additions;
	private double price;
	
	public Burger(String rollType, boolean meat, double price) {
		
	}
	
	public void addAdditions() {
		if(additions<4) {
		additions++;
		}
	}
	
}
