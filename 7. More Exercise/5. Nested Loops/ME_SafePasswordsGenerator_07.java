import java.util.Scanner;

public class ME_SafePasswordsGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int passwords = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (char i = 34; i <= 55; i++) {
            for (char j = 63; j <= 96; j++) {
                for (int k = 1; k <= a + 1; k++) {
                    for (int l = 1; l <= b + 1; l++) {
                        counter++;
                        if (counter >= passwords) {
                            break;
                        } else {
                            i += 1;
                            if (i > 55) {
                                i = 35;
                            }
                            j += 1;
                            if (j > 96) {
                                j = 64;
                            }
                            System.out.printf("%c%c%d%d%c%c|", i, j, k, l, j, i);

                        }
                    }
                }
            }
        }
    }
}
