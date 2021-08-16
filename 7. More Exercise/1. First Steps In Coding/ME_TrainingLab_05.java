import java.util.Scanner;

public class ME_TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double smW = w * 100;
        double smHsKoridor = h * 100;
        double smh = smHsKoridor - 100;

        double bura = Math.floor(smh / 70);
        double redove = Math.floor(smW / 120);

        double numberOfPeople = bura * redove - 3;
        System.out.printf("%.0f", numberOfPeople);
    }
}
