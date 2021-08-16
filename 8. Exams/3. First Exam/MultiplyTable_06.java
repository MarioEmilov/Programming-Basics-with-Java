import java.util.Scanner;

public class MultiplyTable_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstDigit = n % 10;
        int secondDigit = (n / 10) % 10;
        int thirdDigit = ((n / 100) % 100) % 10;

        for (int i = 1; i <= firstDigit; i++) {
            for (int j = 1; j <= secondDigit; j++) {
                for (int k = 1; k <= thirdDigit; k++) {
                    int result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, result);
                }
            }
        }
    }
}
