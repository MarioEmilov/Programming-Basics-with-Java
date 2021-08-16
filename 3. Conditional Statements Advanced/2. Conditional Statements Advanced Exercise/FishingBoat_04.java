import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        int rentBoat = 0;
        double discount = 0;
        double leftSum = 0;
        double neededSum = 0;

        if ("Spring".equals(season)) {
            rentBoat = 3000;
        } else if ("Summer".equals(season) || "Autumn".equals(season)) {
            rentBoat = 4200;
        } else if ("Winter".equals(season)) {
            rentBoat = 2600;
        }
        if (fishers <= 6) {
            discount = rentBoat * 0.90;
            if (fishers % 2 == 0 && (!season.equals("Autumn"))) {
                discount = discount * 0.95;
            }
        } else if (fishers > 7 && fishers <= 11) {
            discount = rentBoat * 0.85;
            if (fishers % 2 == 0 && (!season.equals("Autumn"))) {
                discount = discount * 0.95;
            }
        } else if (fishers > 12) {
            discount = rentBoat * 0.75;
            if (fishers % 2 == 0 && (!season.equals("Autumn"))) {
                discount = discount * 0.95;
            }
        }
        if (budget > discount) {
            leftSum = budget - discount;
            System.out.printf("Yes! You have %.2f leva left.", leftSum);
        } else if (discount > budget) {
            neededSum = discount - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededSum);
        }
    }
}
