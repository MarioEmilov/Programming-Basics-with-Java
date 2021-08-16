import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int prize = 0;

        if (color.equals("Red")) {
            if (size.equals("Large")) {
                prize = number * 16;
            } else if (size.equals("Medium")) {
                prize = number * 13;
            } else if (size.equals("Small")) {
                prize = number * 9;
            }
        } else if (color.equals("Green")) {
            if (size.equals("Large")) {
                prize = number * 12;
            } else if (size.equals("Medium")) {
                prize = number * 9;
            } else if (size.equals("Small")) {
                prize = number * 8;
            }
        } else if (color.equals("Yellow")) {
            if (size.equals("Large")) {
                prize = number * 9;
            } else if (size.equals("Medium")) {
                prize = number * 7;
            } else if (size.equals("Small")) {
                prize = number * 5;
            }
        }

        double razhodi = prize * 0.35;
        double total = prize - razhodi;
        System.out.printf("%.2f leva.",total);
    }
}
