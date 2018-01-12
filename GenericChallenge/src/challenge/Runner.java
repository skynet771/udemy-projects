package challenge;

public class Runner extends Player {
	public Runner(String name, String sport, double speed) {
		super(name, sport);
		this.speed = speed;
	}

	private double speed;

	public double getSpeed() {
		return speed;
	}

}
