import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (destination.equals("Dubai")) {
            if (season.equals("Winter")) {
                price = days * 45000;
            } else if (season.equals("Summer")) {
                price = days * 40000;
            }
            price = (price * 0.70);
         } else if (destination.equals("Sofia")) {
            if (season.equals("Winter")) {
                price = days * 17000;
            } else if (season.equals("Summer")) {
                price = days * 12500;
            }
            price = (price * 0.25) + price;
        } else if (destination.equals("London")) {
            if (season.equals("Winter")) {
                price = days * 24000;
            } else if (season.equals("Summer")) {
                price = days * 20250;
            }
        }
        if (budget >= price) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - price);
        } else {
            System.out.printf("The director needs %.2f leva more!", price - budget);
        }
    }
}
