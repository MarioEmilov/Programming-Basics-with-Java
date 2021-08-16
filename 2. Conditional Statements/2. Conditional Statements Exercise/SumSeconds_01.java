import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTimeSeconds = firstTime + secondTime + thirdTime;

        int minutes = totalTimeSeconds / 60;
        int seconds = totalTimeSeconds % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);

            //друг начин: System.out.printf("%d:%02d", minutes, seconds); като %n долепва нов ред;
        }
    }
}
