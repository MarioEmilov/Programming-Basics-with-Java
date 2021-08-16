import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeNight = "";
        double totalResult = 0;

        if (budget <= 100) {
            destination = "Somewhere in Bulgaria";
            if (season.equals("summer")) {
                typeNight = "Camp";
                totalResult = budget * 0.30;
            } else if (season.equals("winter")) {
                typeNight = "Hotel";
                totalResult = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Somewhere in Balkans";
            if (season.equals("summer")) {
                typeNight = "Camp";
                totalResult = budget * 0.40;
            } else if (season.equals("winter")) {
                typeNight = "Hotel";
                totalResult = budget * 0.80;
            }
        } else if (budget > 1000) {
            destination = "Somewhere in Europe";
            typeNight = "Hotel";
            totalResult = budget * 0.90;
        }
        System.out.println(destination);
        System.out.printf("%s - %.2f", typeNight, totalResult);
    }
}
