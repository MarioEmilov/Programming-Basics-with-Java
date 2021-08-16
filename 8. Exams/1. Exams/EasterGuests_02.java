import java.util.Scanner;

public class EasterGuests_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guest = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double numberKozunak = Math.ceil(guest * 1.0 / 3);
        int numberEggs = guest * 2;

        double priceKozunak = numberKozunak * 4;
        double priceEggs = numberEggs * 0.45;
        double total = priceEggs + priceKozunak;

        if (total <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", numberKozunak, numberEggs);
            System.out.printf("He has %.2f lv. left.", budget - total);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", total - budget);
        }
    }
}
