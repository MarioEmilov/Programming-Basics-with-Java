import java.util.Scanner;

public class GameNumberWars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();
        String input = scanner.nextLine();
        int pointsPlayer1 = 0;
        int pointsPlayer2 = 0;
        int countCards = 0;
        int cards = 36;
        boolean flag = false;

        while (!input.equals("End of game")) {
            int player1Card = Integer.parseInt(input);
            int player2Card = Integer.parseInt(scanner.nextLine());
            countCards += 2;

            if (player1Card == player2Card) {
                int player1Card2 = Integer.parseInt(scanner.nextLine());
                int player2Card2 = Integer.parseInt(scanner.nextLine());
                if (player1Card2 > player2Card2) {
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", player1, pointsPlayer1);
                    break;
                } else if (player2Card2 > player1Card2) {
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", player2, pointsPlayer2);
                    break;
                }
            } else if (player1Card > player2Card) {
                pointsPlayer1 += player1Card - player2Card;
            } else {
                pointsPlayer2 += player2Card - player1Card;
            }
            if (countCards == cards) {
                flag = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (flag || input.equals("End of game")) {
            System.out.printf("%s has %d points%n", player1, pointsPlayer1);
            System.out.printf("%s has %d points", player2, pointsPlayer2);
        }
    }
}
