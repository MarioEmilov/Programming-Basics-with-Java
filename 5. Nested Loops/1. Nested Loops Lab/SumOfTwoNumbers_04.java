import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFoundCombination = false;

        for (int number1 = startNumber; number1 <= endNumber; number1++) {
            for (int number2 = startNumber; number2 <= endNumber; number2++) {
                counter++;
                if (number1 + number2 == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, number1, number2, magicNumber);
                    isFoundCombination = true;
                    return; //return -> Прекратява цялата програма
                }
            }
        }
        if (isFoundCombination == false) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
