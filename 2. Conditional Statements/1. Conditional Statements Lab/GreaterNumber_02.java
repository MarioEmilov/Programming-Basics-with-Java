import java.util.Scanner;

public class GreaterNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. 2 цели числа -> int -> вход
        //2. проверка
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number1 > number2) {
            System.out.println(number1);
        } else { //number1 <= number2
            System.out.println(number2);
        }
    }
}
