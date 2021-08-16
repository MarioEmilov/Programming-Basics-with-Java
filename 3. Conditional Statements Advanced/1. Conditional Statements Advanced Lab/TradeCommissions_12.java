import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;

        if (city.equals("Sofia")) {
            if (quantity >= 0 && quantity <= 500) {
                totalSum = quantity * 0.05;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 500 && quantity <= 1000) {
                totalSum = quantity * 0.07;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 1000 && quantity <= 10000) {
                totalSum = quantity * 0.08;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 10000) {
                totalSum = quantity * 0.12;
                System.out.printf("%.2f", totalSum);
            } else
                System.out.println("error");

        } else if (city.equals("Varna")) {
            if (quantity >= 0 && quantity <= 500) {
                totalSum = quantity * 0.045;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 500 && quantity <= 1000) {
                totalSum = quantity * 0.075;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 1000 && quantity <= 10000) {
                totalSum = quantity * 0.1;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 10000) {
                totalSum = quantity * 0.13;
                System.out.printf("%.2f", totalSum);
            } else
                System.out.println("error");

        } else if (city.equals("Plovdiv")) {
            if (quantity >= 0 && quantity <= 500) {
                totalSum = quantity * 0.055;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 500 && quantity <= 1000) {
                totalSum = quantity * 0.08;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 1000 && quantity <= 10000) {
                totalSum = quantity * 0.12;
                System.out.printf("%.2f", totalSum);
            } else if (quantity > 10000) {
                totalSum = quantity * 0.145;
                System.out.printf("%.2f", totalSum);
            } else
                System.out.println("error");
        }  else
            System.out.println("error");
    }
}
