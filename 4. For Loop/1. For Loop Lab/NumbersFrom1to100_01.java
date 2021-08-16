import java.util.Scanner;

public class NumbersFrom1to100_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //повтаряме: принтираме числото -> увеличавам с 1
        //начало: 1
        //край: 100
        for (int number = 1; number <= 100; number += 1 ) {
            System.out.println(number);
        }
    }
}
