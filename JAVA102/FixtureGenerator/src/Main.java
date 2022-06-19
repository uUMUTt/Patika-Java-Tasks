
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FixtureGenerator<String> fixtureGenerator = new FixtureGenerator();
        List<String> teams = new LinkedList<String>();
        teams.add("Fenerbahce");
        teams.add("Besiktas");
        teams.add("Galatasaray");
        teams.add("Ankaragucu");
        List<List<Fixture<String>>> rounds = fixtureGenerator.getFixtures(teams, true);

        System.out.println("Teams : ");
        for (String team : teams) {
            if (!team.equals("Bay")) {
                System.out.println("-" + team);
            }
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < rounds.size(); i++) {
            System.out.println("Round " + (i + 1));
            List<Fixture<String>> round = rounds.get(i);
            for (Fixture<String> fixture : round) {
                System.out.println(fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
            }
            System.out.println("");
        }
    }
}
