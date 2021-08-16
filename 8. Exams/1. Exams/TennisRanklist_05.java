import java.util.Scanner;

public class TennisRanklist_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turniri = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int winPoints = 0;
        int wins = 0;

        for (int turnir = 1; turnir <= turniri; turnir++) {
            String result = scanner.nextLine();
            if (result.equals("W")) {
                startPoints += 2000;
                winPoints += 2000;
                wins++;
            } else if (result.equals("F")) {
                startPoints += 1200;
                winPoints += 1200;
            } else if (result.equals("SF")) {
                startPoints += 720;
                winPoints += 720;
            }
        }
        System.out.printf("Final points: %d%n", startPoints);
        double average = winPoints * 1.0 / turniri;
        System.out.printf("Average points: %.0f%n", Math.floor(average));
        double procent = (wins * 1.0 / turniri) * 100;
        System.out.printf("%.2f%%", procent);
    }
}
