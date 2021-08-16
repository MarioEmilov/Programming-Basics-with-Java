import java.util.Scanner;

public class ME_Harvest_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loze = Integer.parseInt(scanner.nextLine());
        double grozde = Double.parseDouble(scanner.nextLine());
        int litri = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double allGrozde = loze * grozde;
        double vino = (allGrozde * 0.40) / 2.5;
        if (vino >= litri) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(vino));
            double litresLeft = Math.abs(vino - litri);
            double perWorker = litresLeft / workers;
            System.out.printf("%n%.0f liters left -> %.0f liters per person.",Math.ceil(litresLeft), Math.ceil(perWorker));
        } else {
            double needWine = litri - vino;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(needWine));
        }
    }
}
