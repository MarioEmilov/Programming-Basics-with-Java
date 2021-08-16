import java.util.Scanner;

public class ME_ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countDays = 0;
        int moneyCS = 0;
        int countCS = 0;
        int moneyCC = 0;
        int countCC = 0;
        int total = 0;

        while (!input.equals("End")) {
            int item = Integer.parseInt(input);
            countDays++;

            if (countDays % 2 == 0) {
                if (item < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyCC += item;
                    countCC++;
                    total += item;
                }
            } else {
                if (item > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    moneyCS += item;
                    countCS++;
                    total += item;
                }
            }
            if (total >= money) {
                break;
            }
            input = scanner.nextLine();
        }

        double averageCS = moneyCS * 1.0 / countCS;
        double averageCC = moneyCC * 1.0 / countCC;
        if (total >= money) {
            System.out.printf("Average CS: %.2f%n", averageCS);
            System.out.printf("Average CC: %.2f", averageCC);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
