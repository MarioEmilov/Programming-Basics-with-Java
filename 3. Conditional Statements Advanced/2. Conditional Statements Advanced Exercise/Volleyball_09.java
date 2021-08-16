import java.util.Scanner;

public class Volleyball_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String leapOrNormal = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int sofia = 48 - h;
        double gamesInSofia = sofia * (3.0 / 4);
        double praznik = p * 2.0 / 3;
        double totalGames = gamesInSofia + praznik+ h;

        if (leapOrNormal.equals("leap")) {
            totalGames = totalGames + (totalGames * 0.15);
            System.out.printf("%.0f", Math.floor(totalGames));
        } else if (leapOrNormal.equals("normal")) {
            System.out.printf("%.0f", Math.floor(totalGames));
        }
    }
}
