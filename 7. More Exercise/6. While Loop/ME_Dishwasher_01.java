import java.util.Scanner;

public class ME_Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preparat = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countDays = 0;
        int dishes = 0;
        int pots = 0;
        int nalichenPreparat = preparat * 750;

        while (!input.equals("End")) {
            countDays++;
            int sudove = Integer.parseInt(input);

            if (countDays % 3 == 0) {
                pots += sudove;
                nalichenPreparat -= sudove * 15;
            } else {
                dishes += sudove;
                nalichenPreparat -= sudove * 5;
                }
            if (nalichenPreparat < 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (nalichenPreparat < 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(nalichenPreparat));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", nalichenPreparat);
        }
    }
}
