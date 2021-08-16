import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
        dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            if (fruit.equals("banana")) {
                totalSum = quantity * 2.50;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("apple")) {
                totalSum = quantity * 1.20;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("orange")) {
                totalSum = quantity * 0.85;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("grapefruit")) {
                totalSum = quantity * 1.45;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("kiwi")) {
                totalSum = quantity * 2.70;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("pineapple")) {
                totalSum = quantity * 5.50;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("grapes")) {
                totalSum = quantity * 3.85;
                System.out.printf("%.2f", totalSum);
            } else
                System.out.println("error");

        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (fruit.equals("banana")) {
                totalSum = quantity * 2.70;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("apple")) {
                totalSum = quantity * 1.25;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("orange")) {
                totalSum = quantity * 0.90;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("grapefruit")) {
                totalSum = quantity * 1.60;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("kiwi")) {
                totalSum = quantity * 3.00;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("pineapple")) {
                totalSum = quantity * 5.60;
                System.out.printf("%.2f", totalSum);
            } else if (fruit.equals("grapes")) {
                totalSum = quantity * 4.20;
                System.out.printf("%.2f", totalSum);
            } else
                System.out.println("error");
        } else
            System.out.println("error");
    }
}
