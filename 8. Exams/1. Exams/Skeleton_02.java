import java.util.Scanner;

public class Skeleton_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesOfKontrola = Integer.parseInt(scanner.nextLine());
        int secondsOfKontrola = Integer.parseInt(scanner.nextLine());
        double uleq = Double.parseDouble(scanner.nextLine());
        int izminati100m = Integer.parseInt(scanner.nextLine());

        int kontrola = minutesOfKontrola * 60 + secondsOfKontrola;
        double countNamalqne = uleq / 120;
        double namalenoVreme = countNamalqne * 2.5;
        double vremeMarin = (uleq / 100) * izminati100m - namalenoVreme;
        if (kontrola >= vremeMarin) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", vremeMarin);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", vremeMarin - kontrola);
        }
    }
}
