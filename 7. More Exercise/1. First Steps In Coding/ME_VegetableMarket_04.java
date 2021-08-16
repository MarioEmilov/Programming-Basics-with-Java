import java.util.Scanner;

public class ME_VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetable = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int kgVegetable = Integer.parseInt(scanner.nextLine());
        int kgFruit = Integer.parseInt(scanner.nextLine());

        double profitVegetable = priceVegetable * kgVegetable;
        double profitFruit = priceFruit * kgFruit;
        double total = (profitVegetable + profitFruit) / 1.94;
        System.out.printf("%.2f", total);
    }
}
