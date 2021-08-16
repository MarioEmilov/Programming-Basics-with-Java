import java.util.Scanner;

public class ME_Pets_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodDog = Double.parseDouble(scanner.nextLine());
        double foodCat = Double.parseDouble(scanner.nextLine());
        double foodFranklin = Double.parseDouble(scanner.nextLine());

        double needFoodDog = foodDog * days;
        double needFoodCat = foodCat * days;
        double needFoodFranklin = foodFranklin * days / 1000;

        double totalFoodNeeded = needFoodDog + needFoodCat + needFoodFranklin;
        if (totalFoodNeeded <= foodLeft) {
            double left = foodLeft - totalFoodNeeded;
            System.out.printf("%.0f kilos of food left.", Math.floor(left));
        } else if (totalFoodNeeded > foodLeft) {
            double left1 = totalFoodNeeded - foodLeft;
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(left1));
        }

    }
}
