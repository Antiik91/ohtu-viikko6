package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));
        QueryBuilder query = new QueryBuilder();
//        Matcher m = new And(new HasAtLeast(10, "goals"),
//                new HasAtLeast(10, "assists"),
//                new PlaysIn("PHI")
//        );
//        Matcher s = new And(new HasFewerThan(12, "goals"),
//                new PlaysIn("SJS"));
//
//        Matcher or = new Or(new HasFewerThan(5, "goals"),
//                new HasAtLeast(10, "goals"));
//        
//        Matcher not = new Not(new HasAtLeast(50, "goals"));
//        for (Player player : stats.matches(m)) {
//            System.out.println(player);
//        }
//        System.out.println("JA NYT OMA KYSELY VÄHEMMÄN KUIN ");
//        for (Player player : stats.matches(s)) {
//            System.out.println(player);
//        }
//        System.out.println("JA SEURAAVAKSI TESTATAAN TAI");
//
//        for (Player p : stats.matches(or)) {
//            System.out.println(p);
//        }
//        System.out.println("JA NOT");
//        for (Player p : stats.matches(not)) {
//            System.out.println(p);
//        }

//        Matcher m = query.playsIn("SJS")
//                .hasAtLeast(10, "goals")
//                .hasFewerThan(21, "assists")
//                .build();
//                
//        for (Player p : stats.matches(m)) {
//            System.out.println(p);
//        }
        Matcher m1 = query.playsIn("PHI")
                .hasAtLeast(10, "goals")
                .hasFewerThan(20, "assists").build();

        Matcher m2 = query.playsIn("EDM")
                .hasAtLeast(60, "points")
                .build();

        Matcher m = query.oneOf(m1, m2).build();
        for (Player p : stats.matches(m)) {
            System.out.println(p);
        }
    }

}
