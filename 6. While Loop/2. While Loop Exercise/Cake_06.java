import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int size = width * length;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);

            size -= pieces;

            if (size <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (size <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(size));
        } else {
            System.out.printf("%d pieces are left.", size);
        }
    }
}
