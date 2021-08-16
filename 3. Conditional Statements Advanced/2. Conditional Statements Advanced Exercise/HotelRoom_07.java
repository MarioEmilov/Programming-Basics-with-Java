import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
        }

        priceStudio = priceStudio * numberOfNights;
        priceApartment = priceApartment * numberOfNights;

        if (numberOfNights > 7 && numberOfNights < 14 && (month.equals("May") || month.equals("October"))) {
            priceStudio = priceStudio * 0.95;
        } else if (numberOfNights > 14 && (month.equals("May") || month.equals("October"))) {
            priceStudio = priceStudio * 0.70;
        } else if (numberOfNights > 14 && (month.equals("June") || month.equals("September"))) {
            priceStudio = priceStudio * 0.80;
        }

        if (numberOfNights > 14) {
            priceApartment = priceApartment * 0.90;
        }
        System.out.printf("Apartment: %.2f lv.", priceApartment);
        System.out.printf("%nStudio: %.2f lv.", priceStudio);
    }
}
