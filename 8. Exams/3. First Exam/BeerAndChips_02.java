import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

        double priceBeers = beers * 1.20;
        double priceChips = priceBeers * 0.45;
        double totalPriceChips = Math.ceil(priceChips * chips);

        double totalPrice = totalPriceChips + priceBeers;
        if (totalPrice > budget) {
            System.out.printf("%s needs %.2f more leva!", name, totalPrice - budget);
        } else {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - totalPrice);
        }
    }
}
