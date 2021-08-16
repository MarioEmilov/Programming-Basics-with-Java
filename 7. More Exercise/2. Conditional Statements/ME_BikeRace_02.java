import java.util.Scanner;

public class ME_BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();

        double taxJuniors = 0;
        double taxSeniors = 0;
        double totalsum = 0;
        double discount = 0;

        if (track.equals("trail")) {
            taxJuniors = juniors * 5.50;
            taxSeniors = seniors * 7;
            totalsum = taxJuniors + taxSeniors;
            discount = totalsum * 0.95;
            System.out.printf("%.2f", discount);
        } else if (track.equals("cross-country")) {
            if ((juniors + seniors) >= 50) {
                taxJuniors = (juniors * 8) * 0.75;
                taxSeniors = (seniors * 9.50) * 0.75;
                totalsum = taxJuniors + taxSeniors;
                discount = totalsum * 0.95;
                System.out.printf("%.2f", discount);
            } else if ((juniors + seniors) < 50) {
                taxJuniors = juniors * 8;
                taxSeniors = seniors * 9.50;
                totalsum = taxJuniors + taxSeniors;
                discount = totalsum * 0.95;
                System.out.printf("%.2f", discount);
            }
        } else if (track.equals("downhill")) {
            taxJuniors = juniors * 12.25;
            taxSeniors = seniors * 13.75;
            totalsum = taxJuniors + taxSeniors;
            discount = totalsum * 0.95;
            System.out.printf("%.2f", discount);
        } else if (track.equals("road")) {
            taxJuniors = juniors * 20;
            taxSeniors = seniors * 21.50;
            totalsum = taxJuniors + taxSeniors;
            discount = totalsum * 0.95;
            System.out.printf("%.2f", discount);
        }
    }
}
