import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations; i++) {
            int goldPerDay = Integer.parseInt(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int goldFromMine = 0;

            for (int j = 1; j <= days; j++) {
                int gold = Integer.parseInt(scanner.nextLine());
                goldFromMine += gold;
            }

            double averageGold = goldFromMine * 1.0 / days;
            if (averageGold >= goldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGold);
            } else {
                System.out.printf("You need %.2f gold.%n", goldPerDay - averageGold);
            }
        }
    }
}
