import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        switch (typeFlower) {
            case "Roses":
                totalSum = countFlowers * 5.00;
                if (countFlowers > 80) {
                    totalSum = totalSum * 0.90;
                }
                break;
            case "Dahlias":
                totalSum = countFlowers * 3.80;
                if (countFlowers > 90) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Tulips":
                totalSum = countFlowers * 2.80;
                if (countFlowers > 80) {
                    totalSum = totalSum * 0.85;
                }
                break;
            case "Narcissus":
                totalSum = countFlowers * 3.00;
                if (countFlowers < 120) {
                    totalSum = totalSum * 1.15;
                }
                break;
            case "Gladiolus":
                totalSum = countFlowers * 2.50;
                if (countFlowers < 80) {
                    totalSum = totalSum * 1.20;
                }
                break;
        }
        double diff = Math.abs(budget - totalSum);
        if (budget >= totalSum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
