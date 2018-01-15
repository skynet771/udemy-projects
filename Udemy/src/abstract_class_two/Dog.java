package abstract_class_two;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is eating");
		
	}

	@Override
	public void breath() {
		System.out.println("Breath in, breath out!");
	}

}
