import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Printing statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Crosby");
        System.out.println("Printing statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("Printing statistics for Anaheim Ducks orederd by points");
        NHLStatistics.teamStatistics("ANA");
    }
}
