import java.util.Scanner;

public class ME_Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int mnogoDobur = 0;
        int dobur = 0;
        int sreden = 0;
        int slab = 0;
        double totalOcenki = 0.0;

        for (int student = 1; student <= n; student++) {
            double ocenka = Double.parseDouble(scanner.nextLine());
            totalOcenki += ocenka;
            if (ocenka >= 2.00 && ocenka <= 2.99) {
                slab++;
            } else if (ocenka >= 3.00 && ocenka <= 3.99) {
                sreden++; // += ocenka;
            } else if (ocenka >= 4.00 && ocenka <= 4.99) {
                dobur++; //= ocenka;
            } else if (ocenka >= 5.00 && ocenka <= 6.00) {
                mnogoDobur++; // += ocenka;
            }
        }
        double average = totalOcenki / n;
        double procentSlab = slab * 1.0 / n * 100;
        double procentSreden = sreden * 1.0 / n * 100;
        double procentDobur = dobur * 1.0 / n * 100;
        double procentMnDobur = mnogoDobur * 1.0 / n * 100;
        System.out.printf("Top students: %.2f%%%n", procentMnDobur);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", procentDobur);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", procentSreden);
        System.out.printf("Fail: %.2f%%%n", procentSlab);
        System.out.printf("Average: %.2f", average);
    }
}
