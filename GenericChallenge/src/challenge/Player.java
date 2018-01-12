package challenge;

public class Player {
	protected String name;
	protected String sport;

	public Player(String name, String sport) {
		this.name = name;
		this.sport = sport;
	}

	public String getName() {
		return name;
	}

	public String getSport() {
		return sport;
	}
}
