import java.util.Scanner;

public class ProgrammingBook_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOnePage = Double.parseDouble(scanner.nextLine());
        double priceOneKorica = Double.parseDouble(scanner.nextLine());
        int procentNamalenie = Integer.parseInt(scanner.nextLine());
        double priceDizainer = Integer.parseInt(scanner.nextLine());
        int priceFromAll = Integer.parseInt(scanner.nextLine());

        double priceAll = priceOnePage * 899 + priceOneKorica * 2;
        double discount = priceAll * procentNamalenie * 1.0 / 100;
        double total = priceAll - discount;
        double dizainer = total + priceDizainer;
        double ekip = dizainer * priceFromAll * 1.0 / 100;
        double ekipDiscount = dizainer - ekip;
        System.out.printf("Avtonom should pay %.2f BGN.", ekipDiscount);
    }
}
