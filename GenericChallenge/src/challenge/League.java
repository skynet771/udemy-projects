package challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
	private String name;

	private ArrayList<T> teams = new ArrayList<T>();

	public League(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addTeam(T team) {
		if (!teams.contains(team)) {
			teams.add(team);
			return true;
		} else {
			System.out.println(team.getName() + " is already in this league!");
			return false;
		}
	}

	public void printTeams() {
		Collections.sort(teams);
		for (Team t : teams) {
			System.out.println(t.getName());
		}
	}

}
