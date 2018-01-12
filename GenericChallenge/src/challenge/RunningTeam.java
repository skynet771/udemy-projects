package challenge;

import java.util.ArrayList;

public class RunningTeam<T extends Runner> extends Team {

	private ArrayList<Runner> runners = new ArrayList<Runner>();

	public RunningTeam(String name) {
		super(name);
	}

	public boolean addRunner(T runner) {
		if (!runners.contains(runner)) {
			runners.add(runner);
			return true;
		} else {
			System.out.println(runner.getName() + " is in the team already!");
			return false;
		}
	}

}
