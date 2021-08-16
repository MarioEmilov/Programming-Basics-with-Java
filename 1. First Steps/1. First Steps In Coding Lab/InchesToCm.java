import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // инчове --> вход
        // см = инчове * 2.54
        // печатаме см
        double inches = Double.parseDouble(scanner.nextLine());
        double sm = inches * 2.54;
        System.out.println(sm);
    }
}