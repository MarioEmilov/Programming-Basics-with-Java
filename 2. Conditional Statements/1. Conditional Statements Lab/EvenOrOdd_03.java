import java.util.Scanner;

public class EvenOrOdd_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. число -> int -> вход
        //2. ако е четно -> even -> в противен случай -> "odd"
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
