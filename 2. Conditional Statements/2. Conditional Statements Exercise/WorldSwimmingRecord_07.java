import java.util.Scanner;

public class WorldSwimmingRecord_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());

        double totalDistanceSeconds = distanceMetres * timeInSecondsPerMeter;
        double plusSeconds = Math.floor(distanceMetres / 15) * 12.5;
        double totalTime = totalDistanceSeconds + plusSeconds;

        if (totalTime >= worldRecordSeconds){
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - worldRecordSeconds);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
