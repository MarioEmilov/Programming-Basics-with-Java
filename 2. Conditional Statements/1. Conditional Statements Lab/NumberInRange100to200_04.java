import java.util.Scanner;

public class NumberInRange100to200_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //цяло число -> int -> вход
        //< 100 -> Less than 100
        //<= 100 -> Between 100 and 200
        //> 100 -> Greater than 200
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
