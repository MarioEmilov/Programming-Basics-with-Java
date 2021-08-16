import java.util.Scanner;

public class ME_FlowerShop_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int ziombuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double totalPrice = (magnolii * 3.25) + (ziombuli * 4) + (rozi * 3.50) + (kaktusi * 8);
        double danuk = totalPrice * 0.05;
        double profit = totalPrice - danuk;

        if (present <= profit) {
            double needed = profit - present;
            System.out.printf("She is left with %.0f leva.", Math.floor(needed));
        } else if (present > profit) {
            double left = present - profit;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(left));
        }
    }
}
