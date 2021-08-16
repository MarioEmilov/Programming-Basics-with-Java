import java.util.Scanner;

public class PuppyCare_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int grm = kg * 1000;
        int eat = 0;

        while (!input.equals("Adopted")) {
            int eatGrm = Integer.parseInt(input);
            eat += eatGrm;
            input = scanner.nextLine();
        }
        if (grm >= eat) {
            System.out.printf("Food is enough! Leftovers: %d grams.", grm - eat);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", eat - grm);
        }
    }
}
