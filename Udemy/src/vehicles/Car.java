package vehicles;

public class Car {
	private String name;
	private int wheels;
	private boolean engine;
	private int cylinders;
	
	public Car(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		wheels = 4;
		engine = true;
	}

	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}
	
	public void startEngine() {
		if(!engine) {
			engine = true;
			System.out.println("The engine is started");
		}else {
			System.out.println("Engine is running!");
		}
	}
	public void brake() {
		System.out.println("We are slowing down!");
	}
	
	public void accelerate() {
		System.out.println("Moving faster!");
	}
	
	
}
