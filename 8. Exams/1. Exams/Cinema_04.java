import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seats = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int profit = 0;

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            if (seats < people) {
                break;
            }
            if (people % 3 == 0) {
                profit += (people * 5) - 5;
                seats -= people;
            } else {
                profit += people * 5;
                seats -= people;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", seats);
        } else {
            System.out.println("The cinema is full.");
        }
        System.out.printf("Cinema income - %d lv.", profit);
    }
}
