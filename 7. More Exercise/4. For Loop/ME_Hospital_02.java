import java.util.Scanner;

public class ME_Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());

        int treated = 0;
        int untreated = 0;
        int doctors = 7;

        for (int currentDayPatients = 1; currentDayPatients <= period; currentDayPatients++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (currentDayPatients % 3 == 0) {
                if (untreated > treated) {
                    doctors++;
                }
            }
            if (value <= doctors) {
               treated += value;
            } else {
               untreated += value - doctors;
               treated += doctors;
            }
        }
        System.out.printf("Treated patients: %d.", treated);
        System.out.printf("%nUntreated patients: %d.", untreated);
    }
}
