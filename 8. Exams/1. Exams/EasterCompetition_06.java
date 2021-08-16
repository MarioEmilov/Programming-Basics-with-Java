import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String bestBakerName = "";
        int bestBakerPoints = 0;

        for (int i = 0; i <= count; i++) {
            String bakerName = scanner.nextLine();
            int points = 0;
            String input = scanner.nextLine();

            while (!input.equals("Stop")) {
                points += Integer.parseInt(input);
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, points);
            if (points > bestBakerPoints) {
                bestBakerName = bakerName;
                bestBakerPoints = points;
                System.out.printf("%s is the new number 1!%n", bakerName);
            }
        }
        System.out.printf("%s won competition with %d points!%n", bestBakerName, bestBakerPoints);
    }
}
