import java.util.Scanner;

public class Oscars_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String ocenqvasht = scanner.nextLine();
            double ocenka = Double.parseDouble(scanner.nextLine());

            points += (ocenqvasht.length() * ocenka) / 2;

            if (points > 1250.5) {
                break;
            }
        }

        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, (1250.5 - points));
        }
    }
}
