import java.util.Scanner;

public class FitnessCenter_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peoples = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int prShake = 0;
        int prBar = 0;
        int workOut = 0;
        int protein = 0;

        for (int people = 1; people <= peoples; people++) {
            String input = scanner.nextLine();

            if (input.equals("Back")) {
                back++;
                workOut++;
            } else if (input.equals("Chest")) {
                chest++;
                workOut++;
            } else if (input.equals("Legs")) {
                legs++;
                workOut++;
            } else if (input.equals("Abs")) {
                abs++;
                workOut++;
            } else if (input.equals("Protein shake")) {
                prShake++;
                protein++;
            } else  if (input.equals("Protein bar")) {
                prBar++;
                protein++;
            }
        }
        System.out.printf("%d - back%n", back);
        System.out.printf("%d - chest%n", chest);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", prShake);
        System.out.printf("%d - protein bar%n", prBar);
        System.out.printf("%.2f%% - work out%n", (workOut * 1.0 / peoples) * 100);
        System.out.printf("%.2f%% - protein", (protein * 1.0 / peoples) * 100);
    }
}
