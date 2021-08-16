import java.util.Scanner;

public class ME_UniquePINCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i+=2) {
            for (int j = 2; j <= m; j++) {
                for (int k = 2; k <= l; k+=2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
