import java.util.Scanner;

public class BraceletStand_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monetForDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double spendMoney = Double.parseDouble(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double savedMoney = monetForDay * 5;
        double winMoney = profitPerDay * 5;
        double total = (savedMoney + winMoney) - spendMoney;

        if (total >= pricePresent) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", total);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", pricePresent - total);
        }
    }
}
