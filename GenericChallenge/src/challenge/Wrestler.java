package challenge;

public class Wrestler extends Player {
	private double muscleSize;

	public Wrestler(String name, String sport, double muscleSize) {
		super(name, sport);
		this.muscleSize = muscleSize;
	}

	public double getMuscleSize() {
		return muscleSize;
	}
}
