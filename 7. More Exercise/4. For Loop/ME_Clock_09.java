import java.util.Scanner;

public class ME_Clock_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = 23;
        int minutes = 59;

        for (int hour = 0; hour <= hours; hour++) {
            for (int minute = 0; minute <= minutes; minute++) {
                System.out.printf("%d : %d%n", hour, minute);
            }
        }
    }
}
