import java.util.Scanner;

public class ChristmasPreparation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paper = Integer.parseInt(scanner.nextLine());
        int plat = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pricePaper = paper * 5.80;
        double pricePlat = plat * 7.20;
        double priceGlue = glue * 1.20;
        double total = pricePaper + pricePlat + priceGlue;

        double totalDisc = total * discount * 1.0 / 100;
        double totalWithDisc = total - totalDisc;
        System.out.printf("%.3f", totalWithDisc);
    }
}
