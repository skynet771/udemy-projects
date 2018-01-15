package generics;

public class Mein {
	public static void main(String[] args) {
		FootballPlayer joo = new FootballPlayer("Jo");
		BaseballPlayer pati = new BaseballPlayer("Patt");
		SoccerPlayer beckam = new SoccerPlayer("Beckam");

		Team<FootballPlayer> team1 = new Team<FootballPlayer>("First team");
		team1.addPlayer(joo);
		/*
		 * team1.addPlayer(pati); team1.addPlayer(beckam);
		 */

		System.out.println(team1.numPlayers());
	}
}
