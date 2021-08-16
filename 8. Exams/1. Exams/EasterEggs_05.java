import java.util.Scanner;

public class EasterEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberEggs = Integer.parseInt(scanner.nextLine());
        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;

        for (int eggs = 1; eggs <= numberEggs; eggs++) {
            String color = scanner.nextLine();
            if (color.equals("red")) {
                redEggs++;
            } else if (color.equals("orange")) {
                orangeEggs++;
            } else if (color.equals("blue")) {
                blueEggs++;
            } else if (color.equals("green")) {
                greenEggs++;
            }
        }
        System.out.printf("Red eggs: %d%n", redEggs);
        System.out.printf("Orange eggs: %d%n", orangeEggs);
        System.out.printf("Blue eggs: %d%n", blueEggs);
        System.out.printf("Green eggs: %d%n", greenEggs);

        if (redEggs > orangeEggs && redEggs > blueEggs && redEggs > greenEggs) {
            System.out.printf("Max eggs: %d -> red", redEggs);
        } else if (orangeEggs > redEggs && orangeEggs > blueEggs && orangeEggs > greenEggs) {
            System.out.printf("Max eggs: %d -> orange", orangeEggs);
        } else if (blueEggs > redEggs && blueEggs > orangeEggs && blueEggs > greenEggs) {
            System.out.printf("Max eggs: %d -> blue", blueEggs);
        } else if (greenEggs > redEggs && greenEggs > orangeEggs && greenEggs > blueEggs) {
            System.out.printf("Max eggs: %d -> green", greenEggs);
        }
    }
}
