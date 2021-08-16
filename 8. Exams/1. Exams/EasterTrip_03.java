import java.util.Scanner;

public class EasterTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (dates.equals("21-23")) {
            if (destination.equals("France")) {
                price = nights * 30;
            } else if (destination.equals("Italy")) {
                price = nights * 28;
            } else if (destination.equals("Germany")) {
                price = nights * 32;
            }
        } else if (dates.equals("24-27")) {
            if (destination.equals("France")) {
                price = nights * 35;
            } else if (destination.equals("Italy")) {
                price = nights * 32;
            } else if (destination.equals("Germany")) {
                price = nights * 37;
            }
        } else if (dates.equals("28-31")) {
            if (destination.equals("France")) {
                price = nights * 40;
            } else if (destination.equals("Italy")) {
                price = nights * 39;
            } else if (destination.equals("Germany")) {
                price = nights * 43;
            }
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, price);
    }
}
