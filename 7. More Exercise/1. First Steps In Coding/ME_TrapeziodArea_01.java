import java.util.Scanner;

public class ME_TrapeziodArea_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Лице на трапец
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double lice = (b1 + b2) * h / 2;
        System.out.printf("%.2f", lice);
    }
}
