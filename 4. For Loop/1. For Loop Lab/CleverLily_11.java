import java.util.Scanner;

public class CleverLily_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int numberOfToys = 0;
        int savedMoney = 0;
        int moneyForBirthday = 10;

        for (int currentYear = 1; currentYear <= age; currentYear++) {
            if (currentYear % 2 == 0) {
                savedMoney += (moneyForBirthday - 1); //savedMoney += currentYear * 5 - 1
                moneyForBirthday += 10;               //това може да не се пише
            } else {
                numberOfToys++;
            }
        }
        savedMoney += numberOfToys * priceToy;

        if (savedMoney >= priceWashMachine) {
            System.out.printf("Yes! %.2f", (savedMoney - priceWashMachine));
        } else {
            System.out.printf("No! %.2f", Math.abs(savedMoney - priceWashMachine));
        }
    }
}
