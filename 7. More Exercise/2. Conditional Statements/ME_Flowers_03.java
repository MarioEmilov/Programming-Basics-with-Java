import java.util.Scanner;

public class ME_Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String praznik = scanner.nextLine();

        double price = 0;
        int numberFlowers = hrizantemi + rozi + laleta;

        if (season.equals("Spring") || season.equals("Summer")) {
            price = (((hrizantemi * 1.0) * 2) + ((rozi * 1.0) * 4.10) + ((laleta * 1.0) * 2.50));
                if (praznik.equals("Y")) {
                    price = price * 1.15;
                    if (laleta > 7) {
                        price = price * 0.95;
                    }
                } else if (praznik.equals("N")) {
                    if (laleta > 7) {
                       price = price * 0.95;
                    }
                }
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            price = (((hrizantemi * 1.0) * 3.75) + ((rozi * 1.0) * 4.50) + ((laleta * 1.0)  * 4.15));
                if (praznik.equals("Y")) {
                    price = price * 1.15;
                    if (rozi >= 10 && season.equals("Winter")) {
                        price = price * 0.90;
                    }
                } else if (praznik.equals("N")) {
                    if (rozi >= 10 && season.equals("Winter")) {
                    price = price * 0.90;
                    }
                }
        }

        if (numberFlowers > 20) {
            price = price - (price * 0.20);
        }
        price = price + 2;
        System.out.printf("%.2f", price);
    }
}
