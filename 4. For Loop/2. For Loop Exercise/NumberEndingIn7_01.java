import java.util.Scanner;

public class NumberEndingIn7_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //числа от 1 до 1000, които завършват на 7
        //за всяко едно от числата от 1 до 1000 -> проверка дали завършва на 7
        //ако завършва на 7 трябва да се принтира
        for (int number = 1; number <= 1000; number++) {
            if (number % 10 == 7) {
                System.out.println(number);
            }
        //по лесен вариант
        // for (int number = 7; number <= 997; number += 10) {
        // System.out.println(number);
        }
    }
}
