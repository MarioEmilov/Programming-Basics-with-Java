import java.util.Scanner;

public class MovieTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = a1; i <= a2 - 1; i++) {
            char a = (char) i;
            for (int j = 1; j <= n - 1; j++) {
                for (int k = 1; k <= (n / 2) - 1; k++) {
                    int sum = j + k + i;
                    if (i % 2 == 1 && sum % 2 == 1) {
                        System.out.println(a + "-" + j + k + i);
                    }
                }
            }
        }
    }
}

