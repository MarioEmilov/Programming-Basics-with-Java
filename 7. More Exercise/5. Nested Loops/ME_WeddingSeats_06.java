import java.util.Scanner;

public class ME_WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sector = scanner.nextLine().charAt(0);
        int row = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int factor = 0;

        for (char i = 'A'; i <= sector; i++, row++) {
            for (int j = 1; j <= row; j++) {
                factor = (j % 2 == 0) ? 2 : 0;
                for (char k = 'a'; k < 'a' + seatsOdd + factor; k++) {
                    System.out.printf("%c%d%c%n", i, j, k);
                    counter++;
                }
            }
        }
        System.out.printf("%d", counter);
    }
}
