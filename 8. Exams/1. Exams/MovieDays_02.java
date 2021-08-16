import java.util.Scanner;

public class MovieDays_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int timeScene = Integer.parseInt(scanner.nextLine());

        double podgotovka = totalTime * 0.15;
        double timeForScenes = scenes * timeScene;
        double neededTime = podgotovka + timeForScenes;
        if (totalTime >= neededTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", totalTime - neededTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", neededTime - totalTime);
        }
    }
}
