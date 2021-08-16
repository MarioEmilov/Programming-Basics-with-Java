import java.util.Scanner;

public class EasterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenaBrashno = Double.parseDouble(scanner.nextLine());
        double kgBrashno = Double.parseDouble(scanner.nextLine());
        double kgZahar = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int maq = Integer.parseInt(scanner.nextLine());

        double cenaZahar = cenaBrashno * 0.75;
        double cenaEggs = cenaBrashno * 1.10;
        double cenaMaq = cenaZahar * 0.20;
        double priceBrashno = cenaBrashno * kgBrashno;
        double priceZahar = kgZahar * cenaZahar;
        double priceEggs = eggs * cenaEggs;
        double priceMaq = cenaMaq * maq;
        double total = priceBrashno + priceEggs + priceMaq + priceZahar;
        System.out.printf("%.2f", total);
    }
}
