package challenge;

public class Mein {
	public static void main(String[] args) {
		Wrestler wrestler = new Wrestler("Dan Kolov", "Wrestling", 48);
		Wrestler wrestler2 = new Wrestler("Bei Don", "Wrestling", 39);
		Runner runner = new Runner("Ben Jones", "Sprint", 97);

		WrestlingTeam<Wrestler> wTeam = new WrestlingTeam<Wrestler>("Wrestlers92");
		RunningTeam<Runner> rTeam = new RunningTeam<Runner>("Runners86");

		WrestlingTeam<Wrestler> wTeam2 = new WrestlingTeam<Wrestler>("Bears");

		wTeam.addWrestler(wrestler);
		rTeam.addRunner(runner);
		wTeam2.addWrestler(wrestler2);

		League<WrestlingTeam<Wrestler>> wLeague = new League<WrestlingTeam<Wrestler>>("Wrestling league");
		wLeague.addTeam(wTeam);
		wLeague.addTeam(wTeam2);
		wLeague.addTeam(wTeam2);
		wTeam.setPoints(50.0);
		wTeam2.setPoints(92.2);

		wLeague.printTeams();

	}
}
