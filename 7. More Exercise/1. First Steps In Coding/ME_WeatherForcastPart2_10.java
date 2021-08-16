import java.util.Scanner;

public class ME_WeatherForcastPart2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gradusi = Double.parseDouble(scanner.nextLine());

        if (gradusi >= 5 && gradusi <= 11.9) {
            System.out.println("Cold");
        } else if (gradusi >= 12 && gradusi <= 14.9) {
            System.out.println("Cool");
        } else if (gradusi >= 15 && gradusi <= 20) {
            System.out.println("Mild");
        } else if (gradusi >= 20.1 && gradusi <= 25.9) {
            System.out.println("Warm");
        } else if (gradusi >= 26 && gradusi <= 35) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
