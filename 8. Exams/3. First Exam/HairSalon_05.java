import java.util.Scanner;

public class HairSalon_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int profit = 0;

        while (!input.equals("closed")) {
            String usluga = input;
            if (usluga.equals("haircut")) {
                String haircut = scanner.nextLine();
                if (haircut.equals("mens")) {
                    profit += 15;
                } else if (haircut.equals("ladies")) {
                    profit += 20;
                } else if (haircut.equals("kids")) {
                    profit += 10;
                }
            } else if (usluga.equals("color")) {
                String color = scanner.nextLine();
                if (color.equals("touch up")) {
                    profit += 20;
                } else if (color.equals("full color")) {
                    profit += 30;
                }
            }

            if (profit >= target) {
                break;
            }

            input = scanner.nextLine();
        }

        if (profit >= target) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %dlv. more.%n", target - profit);
        }
        System.out.printf("Earned money: %dlv.", profit);
    }
}
