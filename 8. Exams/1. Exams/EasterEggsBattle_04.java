import java.util.Scanner;

public class EasterEggsBattle_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayer = Integer.parseInt(scanner.nextLine());
        int secondPlayer = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();
        int countFirstPlayer = 0;
        int countSecondPlayer = 0;

        while (!winner.equals("End of battle")) {
            if (winner.equals("one")) {
                countSecondPlayer++;
                if (countSecondPlayer == secondPlayer) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayer - countFirstPlayer);
                    break;
                }
            } else if (winner.equals("two")) {
                countFirstPlayer++;
                if (countFirstPlayer == firstPlayer) {
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayer - countSecondPlayer);
                    break;
                }
            }
            winner = scanner.nextLine();
        }
        if (firstPlayer == countFirstPlayer || secondPlayer == countSecondPlayer) {

        } else {
            System.out.printf("Player one has %d eggs left.%n", firstPlayer - countFirstPlayer);
            System.out.printf("Player two has %d eggs left.", secondPlayer - countSecondPlayer);
        }
    }
}
