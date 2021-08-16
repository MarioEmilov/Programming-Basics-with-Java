import java.util.Scanner;

public class OddEvenPosition_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = Double.MIN_VALUE;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -999999999.9;

        double evenSum = Double.MIN_VALUE;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -999999999.9;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                oddSum += number;
                if (oddMin > number) {
                    oddMin = number;
                }
                if (oddMax < number) {
                    oddMax = number;
                }
            } else {
                evenSum += number;
                if (evenMin > number) {
                    evenMin = number;
                }
                if (evenMax < number) {
                    evenMax = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == Double.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == -999999999.9) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == Double.MAX_VALUE) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == -999999999.9) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}
