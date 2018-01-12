package challenge;

import java.util.ArrayList;

public class WrestlingTeam<T extends Wrestler> extends Team {
	private ArrayList<Wrestler> wrestlers = new ArrayList<Wrestler>();

	public WrestlingTeam(String name) {
		super(name);
	}

	public boolean addWrestler(T wrestler) {
		if (!wrestlers.contains(wrestler)) {
			wrestlers.add(wrestler);
			return true;
		} else {
			System.out.println(wrestler.getName() + " is already in the team");
			return false;
		}
	}

}
