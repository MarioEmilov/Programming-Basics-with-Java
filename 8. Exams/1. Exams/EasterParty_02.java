import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guest = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cake = budget * 0.10;
        double discount = 0.0;
        double total = 0.0;
        if (guest >= 10 && guest <= 15) {
            discount = pricePerPerson * 0.85;
            total = guest * discount + cake;
        } else if (guest > 15 && guest <= 20) {
            discount = pricePerPerson * 0.80;
            total = guest * discount + cake;
        } else if (guest > 20) {
            discount = pricePerPerson * 0.75;
            total = guest * discount + cake;
        } else {
            discount = pricePerPerson * guest;
            total = discount + cake;
        }

        if (total <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - total);
        } else {
            System.out.printf("No party! %.2f leva needed.", total - budget);
        }
    }
}
