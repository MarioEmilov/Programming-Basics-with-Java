import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();
        double price = 0;

        if (month.equals("march") || month.equals("april") || month.equals("may")) {

            if (dayNight.equals("day")) {
                price = 10.50;
                if (people >= 4) {
                    price = price * 0.90;
                }
                if (hours >= 5) {
                    price = price * 0.50;
                }
            } else if (dayNight.equals("night")) {
                price = 8.40;
                if (people >= 4) {
                    price = price * 0.90;
                }
                if (hours >= 5) {
                    price = price * 0.50;
                }
            }
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            if (dayNight.equals("day")) {
                price = 12.60;
                if (people >= 4) {
                    price = price * 0.90;
                }
                if (hours >= 5) {
                    price = price * 0.50;
                }
            } else if (dayNight.equals("night")) {
                price = 10.20;
                if (people >= 4) {
                    price = price * 0.90;
                }
                if (hours >= 5) {
                    price = price * 0.50;
                }
            }
        }
        double total = price * people * hours;
        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", total);
    }
}
