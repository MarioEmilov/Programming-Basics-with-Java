import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double interest = deposit * (percent / 100);
        double monthlyInterest = interest / 12;
        double sum = deposit + (months * monthlyInterest);
        System.out.println(sum);
    }
}
