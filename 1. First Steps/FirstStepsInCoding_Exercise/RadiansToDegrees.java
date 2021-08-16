import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        // градус = радиан * 180 / п

        double degrees = radians * 180 / Math.PI;
        System.out.printf("%.0f", degrees);
    }
}
