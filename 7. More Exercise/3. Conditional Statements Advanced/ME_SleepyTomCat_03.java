import java.util.Scanner;

public class ME_SleepyTomCat_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - freeDays;
        int totalPlayMinutes = (workingDays * 63) + (freeDays * 127);

        double difference = Math.abs(totalPlayMinutes - 30000);
        double hours = difference / 60;
        double minute = difference % 60;

        if (totalPlayMinutes > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", Math.floor(hours), Math.floor(minute));
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(hours), Math.floor(minute));
        }
    }
}