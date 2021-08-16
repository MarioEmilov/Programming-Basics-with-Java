import java.util.Scanner;

public class SantasHoliday_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String space = scanner.nextLine();
        String grade = scanner.nextLine();
        double price = 0;

        if (space.equals("room for one person")) {
            price = (days - 1) * 18.00;
        } else if (space.equals("apartment")) {
            price = (days - 1) * 25.00;
            if (days < 10) {
                price = price * 0.70;
            } else if (days <= 15) {
                price = price * 0.65;
            } else {
                price = price * 0.50;
            }
        } else if (space.equals("president apartment")) {
            price = (days - 1) * 35.00;
            if (days < 10) {
                price = price * 0.90;
            } else if (days <= 15) {
                price = price * 0.85;
            } else {
                price = price * 0.80;
            }
        }
        if (grade.equals("positive")) {
            price = price * 1.25;
        } else if (grade.equals("negative")) {
            price = price * 0.90;
        }
        System.out.printf("%.2f", price);
    }
}
