import java.util.Scanner;

public class ME_BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int yearUntilLives = Integer.parseInt(scanner.nextLine());
        double moneySpend = 0.0;
        int ageIvancho = 18;

        for (int currentYear = 1800; currentYear <= yearUntilLives ; currentYear++) {
            if (currentYear % 2 == 0) {
                moneySpend += 12000;
                ageIvancho++;
            } else {
                moneySpend += 12000 + (50 * (ageIvancho++));
            }
        }
        if (money >= moneySpend) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", (money - moneySpend));
        } else {
            System.out.printf("He will need %.2f dollars to survive.", (moneySpend - money));
        }
    }
}
