import java.util.Scanner;

public class ME_SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double priceHotel = 0.0;
        String sport = "";

        if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
            if (season.equals("Winter")) {
                priceHotel = (nights * 1.0) * 9.60 * (students * 1.0);
                if (students >= 50) {
                    priceHotel = priceHotel - (priceHotel * 0.50);
                } else if (students >= 20) {
                    priceHotel = priceHotel - (priceHotel * 0.15);
                } else if (students >= 10) {
                    priceHotel = priceHotel - (priceHotel * 0.05);
                }
                if (typeGroup.equals("boys")) {
                    sport = "Judo";
                } else {
                    sport = "Gymnastics";
                }
                System.out.printf("%s %.2f lv.", sport, priceHotel);
            } else if (season.equals("Spring")) {
                priceHotel = (nights * 1.0) * 7.20 * (students * 1.0);
                if (students >= 50) {
                    priceHotel = priceHotel - (priceHotel * 0.50);
                } else if (students >= 20) {
                    priceHotel = priceHotel - (priceHotel * 0.15);
                } else if (students >= 10) {
                    priceHotel = priceHotel - (priceHotel * 0.05);
                }
                if (typeGroup.equals("boys")) {
                    sport = "Tennis";
                } else {
                    sport = "Athletics";
                }
                System.out.printf("%s %.2f lv.", sport, priceHotel);
            } else if (season.equals("Summer")) {
                priceHotel = (nights * 1.0) * 15 * (students * 1.0);
                if (students >= 50) {
                    priceHotel = priceHotel - (priceHotel * 0.50);
                } else if (students >= 20) {
                    priceHotel = priceHotel - (priceHotel * 0.15);
                } else if (students >= 10) {
                    priceHotel = priceHotel - (priceHotel * 0.05);
                }
                if (typeGroup.equals("boys")) {
                    sport = "Football";
                } else {
                    sport = "Volleyball";
                }
                System.out.printf("%s %.2f lv.", sport, priceHotel);
            }
        }  else if (typeGroup.equals("mixed")) {
            if (season.equals("Winter")) {
                priceHotel = (nights * 1.0) * 10 * (students * 1.0);
                if (students >= 50) {
                    priceHotel = priceHotel - (priceHotel * 0.50);
                } else if (students >= 20) {
                    priceHotel = priceHotel - (priceHotel * 0.15);
                } else if (students >= 10) {
                    priceHotel = priceHotel - (priceHotel * 0.05);
                }
                sport = "Ski";
                System.out.printf("%s %.2f lv.", sport, priceHotel);
            } else if (season.equals("Spring")) {
                priceHotel = (nights * 1.0) * 9.50 * (students * 1.0);
                if (students >= 50) {
                    priceHotel = priceHotel - (priceHotel * 0.50);
                } else if (students >= 20) {
                    priceHotel = priceHotel - (priceHotel * 0.15);
                } else if (students >= 10) {
                    priceHotel = priceHotel - (priceHotel * 0.05);
                }
                sport = "Cycling";
                System.out.printf("%s %.2f lv.", sport, priceHotel);
            } else if (season.equals("Summer")) {
                priceHotel = (nights * 1.0) * 20 * (students * 1.0);
                if (students >= 50) {
                    priceHotel = priceHotel - (priceHotel * 0.50);
                } else if (students >= 20) {
                    priceHotel = priceHotel - (priceHotel * 0.15);
                } else if (students >= 10) {
                    priceHotel = priceHotel - (priceHotel * 0.05);
                }
                sport = "Swimming";
                System.out.printf("%s %.2f lv.", sport, priceHotel);
            }
        }
    }
}
