import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. име -> конзола -> променлива
        //2. печатаме "Hello, <name>!;
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
