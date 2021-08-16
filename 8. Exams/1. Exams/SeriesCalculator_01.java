import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeWithoutAdd = Double.parseDouble(scanner.nextLine());

        double episodeWithAdd = episodeWithoutAdd + (episodeWithoutAdd * 0.20);
        double finalEpisode = seasons * 10;
        double total = seasons * episodes * episodeWithAdd + finalEpisode;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serial, total);

    }
}
