import java.util.Scanner;

public class EasterBake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bake = Integer.parseInt(scanner.nextLine());
        int totalSugar = 0;
        int totalFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int numberBake = 1; numberBake <= bake; numberBake++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());
            totalSugar += sugar;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            totalFlour += flour;
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }

        double packSugar = Math.ceil(totalSugar * 1.0 / 950);
        double packFlour = Math.ceil(totalFlour * 1.0 / 750);

        System.out.printf("Sugar: %.0f%n", packSugar);
        System.out.printf("Flour: %.0f%n", packFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
