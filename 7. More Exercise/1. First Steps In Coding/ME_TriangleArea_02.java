import java.util.Scanner;

public class ME_TriangleArea_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Лице на триъгълник

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double lice = a * h / 2;
        System.out.printf("%.2f", lice);
    }
}
