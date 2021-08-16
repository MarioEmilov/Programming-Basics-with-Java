import java.util.Scanner;

public class ME_Firma_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());

        double obu4enie = daysNeeded * 0.90;
        double workHours = obu4enie * 8;
        double izvanredno = people * (2 * daysNeeded);
        double total = workHours + izvanredno;
        if (total >= hours) {
           double ostavat = total - hours;
            System.out.printf("Yes!%.0f hours left.", Math.floor(ostavat));
        } else if (total < hours){
            double nujni = hours - total;
            System.out.printf("Not enough time!%.0f hours needed.", Math.ceil(nujni));
        }
    }
}
