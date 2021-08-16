import java.util.Scanner;

public class LunchBreak_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int restTime = Integer.parseInt(scanner.nextLine());

        double timeForLunch = restTime * 1.0 * 1 / 8;
        double timeForRest = restTime * 1.0 * 1 / 4;
        double time = restTime - (timeForLunch + timeForRest);

        if (time >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(time - episodeTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episodeTime - time));
        }
    }
}
