import java.util.Scanner;

public class FilmPremiere_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String paket = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (name.equals("John Wick")) {
            if (paket.equals("Drink")) {
                price = tickets * 12;
            } else if (paket.equals("Popcorn")) {
                price = tickets * 15;
            } else if (paket.equals("Menu")) {
                price = tickets * 19;
            }
        } else if (name.equals("Star Wars")) {
            if (paket.equals("Drink")) {
                price = tickets * 18;
            } else if (paket.equals("Popcorn")) {
                price = tickets * 25;
            } else if (paket.equals("Menu")) {
                price = tickets * 30;
            }
            if (tickets >= 4) {
                price = (price * 0.70);
            }
        } else if (name.equals("Jumanji")) {
            if (paket.equals("Drink")) {
                price = tickets * 9;
            } else if (paket.equals("Popcorn")) {
                price = tickets * 11;
            } else if (paket.equals("Menu")) {
                price = tickets * 14;
            }
            if (tickets == 2) {
                price = (price * 0.85);
            }
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
