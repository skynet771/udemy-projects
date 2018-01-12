package challenge;

public class Team implements Comparable<Team> {
	protected String name;
	protected double points;

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	@Override
	public int compareTo(Team team) {
		if (this.points > team.getPoints()) {
			return -1;
		} else if (this.points < team.getPoints()) {
			return 1;
		} else {
			return 0;
		}
	}

}
