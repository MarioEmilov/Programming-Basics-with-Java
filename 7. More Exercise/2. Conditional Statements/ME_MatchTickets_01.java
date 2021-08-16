import java.util.Scanner;

public class ME_MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numPeople = Integer.parseInt(scanner.nextLine());

        double priceVip = 0.0;
        double priceNormal = 0.0;
        double sum = 0.0;

        if (category.equals("VIP")) {
            priceVip = 499.99;
            sum = priceVip * numPeople;
        } else if (category.equals("Normal")) {
            priceNormal = 249.99;
            sum = priceNormal * numPeople;
        }

        double discount = 0.0;

        if (numPeople > 0 && numPeople <= 4) {
            discount = budget - (budget * 0.75);
        } else if (numPeople > 4 && numPeople <= 9) {
            discount = budget - (budget * 0.60);
        } else if (numPeople > 9 && numPeople <= 24) {
            discount = budget - (budget * 0.50);
        } else if (numPeople > 24 && numPeople <= 49) {
            discount = budget - (budget * 0.40);
        } else if (numPeople >= 50) {
            discount = budget - (budget * 0.25);
        }

        if (sum <= discount) {
            System.out.printf("Yes! You have %.2f leva left.", (discount - sum));
        } else if (sum > discount) {
            System.out.printf("Not enough money! You need %.2f leva.", (sum - discount));
        }
    }
}
