import java.util.Scanner;

public class ME_FuelTank_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double litters = Double.parseDouble(scanner.nextLine());

        if (typeFuel.equals("Diesel")) {
            if (litters >= 25) {
                System.out.println("You have enough diesel.");
            } else {
                System.out.println("Fill your tank with diesel!");
            }
        } else if (typeFuel.equals("Gasoline")) {
            if (litters >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else if (typeFuel.equals("Gas")) {
            if (litters >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
