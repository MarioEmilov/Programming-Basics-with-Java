import java.util.Scanner;

public class ME_MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i >= 0; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number >= 0) {
                System.out.printf("Result: %.2f%n", number * 2);
            } else {
                System.out.println("Negative number!");
                break;
            }
        }
    }
}
