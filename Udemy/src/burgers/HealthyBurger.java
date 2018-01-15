package burgers;

public class HealthyBurger extends Burger{

	
	
	public HealthyBurger(boolean meat, double price) {
		super("brown rye", meat, price);
	}
	
	public void addAdditions() {
		if(additions<6) {
			additions++;
		}else {
			System.out.println("You cant add more additions");
		}
	}
}
