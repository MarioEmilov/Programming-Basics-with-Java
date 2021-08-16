import java.util.Scanner;

public class ME_FuelTankPart2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double litters = Double.parseDouble(scanner.nextLine());
        String discCard = scanner.nextLine();
        double totalPrice = 0;

        if (typeFuel.equals("Gas")) {
            if (discCard.equals("Yes")) {
                totalPrice = litters * (0.93 - 0.08);
            } else {
                totalPrice = litters * 0.93;
            }
            if (litters >= 20 && litters <= 25) {
                totalPrice = totalPrice - (totalPrice * 0.08);
            } else if (litters > 25) {
                totalPrice = totalPrice - (totalPrice * 0.10);
            }
        } else if (typeFuel.equals("Gasoline")) {
            if (discCard.equals("Yes")) {
                totalPrice = litters * (2.22 - 0.18);
            } else {
                totalPrice = litters * 2.22;
            }
            if (litters >= 20 && litters <= 25) {
                totalPrice = totalPrice - (totalPrice * 0.08);
            } else if (litters > 25) {
                totalPrice = totalPrice - (totalPrice * 0.10);
            }
        } else if (typeFuel.equals("Diesel")) {
            if (discCard.equals("Yes")) {
                totalPrice = litters * (2.33 - 0.12);
            } else {
                totalPrice = litters * 2.33;
            }
            if (litters >= 20 && litters <= 25) {
                totalPrice = totalPrice - (totalPrice * 0.08);
            } else if (litters > 25) {
                totalPrice = totalPrice - (totalPrice * 0.10);
            }
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
