import java.util.Scanner;

public class ME_CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double lice = Math.PI * r * r;
        double perimetur = 2 * Math.PI * r;
        System.out.printf("%.2f%n", lice);
        System.out.printf("%.2f", perimetur);
    }
}
