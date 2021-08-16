import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine());
        double moneyWithdraw = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        System.out.println(money);
        System.out.println(moneyWithdraw);
        System.out.println(name);

        int number1 = 5;
        int number2 = 2;
        System.out.println(number1 * 1.0 / number2);
    }
}
