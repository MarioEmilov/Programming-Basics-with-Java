import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colls = Integer.parseInt(scanner.nextLine());

        int allSeats = rows * colls;
        double totalResult = 0;

        switch (type) {
            case "Premiere":
                totalResult = allSeats * 12.0;
                break;
            case "Normal":
                totalResult = allSeats * 7.50;
                break;
            case "Discount":
                totalResult = allSeats * 5.0;
                break;
        }

        System.out.printf("%.2f leva", totalResult);
    }
}
