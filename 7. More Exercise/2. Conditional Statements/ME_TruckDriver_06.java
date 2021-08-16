import java.util.Scanner;

public class ME_TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double zaplata = 0;
        double danuk = 0;

        if (kmPerMonth <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                zaplata = (kmPerMonth * 0.75) * 4;
                danuk = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", danuk);
            } else if (season.equals("Summer")) {
                zaplata = (kmPerMonth * 0.90) * 4;
                danuk = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", danuk);
            } else if (season.equals("Winter")) {
                zaplata = (kmPerMonth * 1.05) * 4;
                danuk = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", danuk);
            }
        } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                zaplata = (kmPerMonth * 0.95) * 4;
                danuk = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", danuk);
            } else if (season.equals("Summer")) {
                zaplata = (kmPerMonth * 1.10) * 4;
                danuk = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", danuk);
            } else if (season.equals("Winter")) {
                zaplata = (kmPerMonth * 1.25) * 4;
                danuk = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", danuk);
            }
        } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
            if (season.equals("Spring") || season.equals("Autumn") || season.equals("Summer") || season.equals("Winter"))
                zaplata = (kmPerMonth * 1.45) * 4;
                danuk = zaplata - (zaplata * 0.10);
                System.out.printf("%.2f", danuk);
        }
    }
}

