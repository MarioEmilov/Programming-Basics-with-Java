import java.util.Scanner;

public class ME_ChallengeTheWedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int table = Integer.parseInt(scanner.nextLine());
        int tableCounter = 0;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                System.out.printf("(%d <-> %d) ", i, j);
                tableCounter++;
                if (tableCounter == table) {
                    return;
                }
            }
        }
    }
}
