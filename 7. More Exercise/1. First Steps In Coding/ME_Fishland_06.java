import java.util.Scanner;

public class ME_Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceScumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());

        double pricePalamud = priceScumriq + (priceScumriq * 0.60);
        double sumPalamud = kgPalamud * pricePalamud;

        double priceSafrid = priceCaca + (priceCaca * 0.80);
        double sumSafrid = kgSafrid * priceSafrid;

        double sumMidi = kgMidi * 7.50;

        double total = sumPalamud + sumSafrid + sumMidi;
        System.out.printf("%.2f", total);
    }
}
