import java.util.Scanner;

public class GodzillaVsKong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceOneClothes = Double.parseDouble(scanner.nextLine());

        double decorMoney = budget * 0.10;
        double sumClothes = people * priceOneClothes;

        if (people > 150) {
            sumClothes = sumClothes * 0.90;
        }

        double totalSum = decorMoney + sumClothes;

        double diff = Math.abs(budget - totalSum);
        if (totalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
