import java.util.Scanner;

public class NumbersN_1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //повтаряме: печатаме числото
        //начало: n
        //край: 1
        //всеки път намаляме числото с 1
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = n; number >= 1; number-- ) {
            System.out.println(number);
        }
    }
}
