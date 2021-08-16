import java.util.Scanner;

public class ME_CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double kabrio = 0;
        double djip = 0;


        if (budget <= 100) {
            if (season.equals("Summer")) {
                kabrio = budget * 0.35;
                System.out.println("Economy class");
                System.out.printf("Cabrio - %.2f", kabrio);
            } else if (season.equals("Winter")) {
                djip = budget * 0.65;
                System.out.println("Economy class");
                System.out.printf("Jeep - %.2f", djip);
            }
        } else if (budget > 100 && budget <= 500) {
            if (season.equals("Summer")) {
                kabrio = budget * 0.45;
                System.out.println("Compact class");
                System.out.printf("Cabrio - %.2f", kabrio);
            } else if (season.equals("Winter")) {
                djip = budget * 0.80;
                System.out.println("Compact class");
                System.out.printf("Jeep - %.2f", djip);
            }
        } else if (budget > 500) {
            if (season.equals("Winter") || season.equals("Summer")) {
                djip = budget * 0.90;
                System.out.println("Luxury class");
                System.out.printf("Jeep - %.2f", djip);
            }
        }
    }
}
