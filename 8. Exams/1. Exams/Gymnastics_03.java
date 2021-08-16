import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String ured = scanner.nextLine();
        double trudnost = 0;
        double izpulnenie = 0;
        double total = 0;

        if (country.equals("Russia")) {
            if (ured.equals("ribbon")) {
                trudnost = 9.100;
                izpulnenie = 9.400;
                total = trudnost + izpulnenie;
            } else if (ured.equals("hoop")) {
                trudnost = 9.300;
                izpulnenie = 9.800;
                total = trudnost + izpulnenie;
            } else if (ured.equals("rope")) {
                trudnost = 9.600;
                izpulnenie = 9.000;
                total = trudnost + izpulnenie;
            }
        } else if (country.equals("Bulgaria")) {
            if (ured.equals("ribbon")) {
                trudnost = 9.600;
                izpulnenie = 9.400;
                total = trudnost + izpulnenie;
            } else if (ured.equals("hoop")) {
                trudnost = 9.550;
                izpulnenie = 9.750;
                total = trudnost + izpulnenie;
            } else if (ured.equals("rope")) {
                trudnost = 9.500;
                izpulnenie = 9.400;
                total = trudnost + izpulnenie;
            }
        } else if (country.equals("Italy")) {
            if (ured.equals("ribbon")) {
                trudnost = 9.200;
                izpulnenie = 9.500;
                total = trudnost + izpulnenie;
            } else if (ured.equals("hoop")) {
                trudnost = 9.450;
                izpulnenie = 9.350;
                total = trudnost + izpulnenie;
            } else if (ured.equals("rope")) {
                trudnost = 9.700;
                izpulnenie = 9.150;
                total = trudnost + izpulnenie;
            }
        }
        if (total < 20) {
            double nedostiga = (20 - total);
            double procent = (nedostiga / 20) * 100;
            System.out.printf("The team of %s get %.3f on %s.%n", country, total, ured);
            System.out.printf("%.2f%%", procent);
        }
    }
}
