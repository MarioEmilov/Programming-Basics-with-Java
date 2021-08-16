import java.util.Scanner;

public class ME_CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = n; i <= m; i++) {
            for (int j = n; j <= m; j++) {
                for (int k = n; k <= m; k++) {
                    for (int l = n; l <= m; l++) {
                        if (i % 2 == 0 && l % 2 !=0 || i % 2 != 0 && l % 2 == 0) {
                            if (i > l) {
                                if ((j + k) % 2 == 0) {
                                    System.out.printf("%d%d%d%d ", i, j, k, l);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
