import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceRentHall = Integer.parseInt(scanner.nextLine());

        double priceCake = priceRentHall * 0.20;
        double priceDrinks = priceCake - (priceCake * 0.45);
        double priceAnimator = priceRentHall / 3.0;

        double sum = priceRentHall + priceCake + priceDrinks + priceAnimator;
        System.out.println(sum);
    }
}
