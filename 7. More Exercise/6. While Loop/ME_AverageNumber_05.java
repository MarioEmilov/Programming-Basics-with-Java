import java.util.Scanner;

public class ME_AverageNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        double average = sum / n;
        System.out.printf("%.2f", average);
    }
}
