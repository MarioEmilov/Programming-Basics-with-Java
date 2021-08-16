import java.util.Scanner;

public class Workout_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());
        double km = 0;
        double kmPerDay = kmFirstDay;


        for (int Day = 1; Day <= days; Day++) {
            int procent = Integer.parseInt(scanner.nextLine());
            kmPerDay = kmPerDay + (kmPerDay * (procent * 1.0 / 100));
            km += kmPerDay;
        }

        double totalKm = km + kmFirstDay;

        if (totalKm >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKm - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKm));
        }
    }
}
