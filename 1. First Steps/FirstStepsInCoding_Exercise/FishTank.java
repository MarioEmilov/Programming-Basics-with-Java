import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenghtSm = Double.parseDouble(scanner.nextLine());
        double widthSm = Double.parseDouble(scanner.nextLine());
        double heightSm = Double.parseDouble(scanner.nextLine());
        double parcent = Double.parseDouble(scanner.nextLine());

        //V=a.b.c
        double volume = lenghtSm * widthSm * heightSm;
        double totalLitters = volume * 0.001;
        double parcentSum = parcent * 0.01;
        double total = totalLitters * (1 - parcentSum);
        System.out.printf("%.2f", total);
    }
}
