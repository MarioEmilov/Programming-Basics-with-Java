import java.util.Scanner;

public class ToyShop100points_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = countPuzzles * 2.60;
        double dollsPrice = countDolls * 3;
        double bearsPrice = countBears * 4.10;
        double minionsPrice = countMinions * 8.20;
        double trucksPrice = countTrucks * 2;

        double sum = puzzlePrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;
        int countToys = countPuzzles + countDolls + countBears + countMinions + countTrucks;

        if (countToys >= 50) {
            sum = sum * 0.75;
        }
        double profit = sum * 0.9;

        if (profit >= priceTrip) {
            double moneyLeft = profit - priceTrip;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double moneyNeed = priceTrip - profit;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeed);
        }

    }
}
