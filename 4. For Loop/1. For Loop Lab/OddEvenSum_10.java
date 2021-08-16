import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumEvenPositions = 0; //сума на числата на четните
        int sumOddPositions = 0; //сума на числата на нечетни
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            //ако позицията е нечетна
            if (number % 2 ==1) {
                sumOddPositions += value;
            } else { //ако позицията е четна
                sumEvenPositions += value;
            }
        }
        if (sumEvenPositions == sumOddPositions) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumEvenPositions);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEvenPositions - sumOddPositions));
        }
    }
}
