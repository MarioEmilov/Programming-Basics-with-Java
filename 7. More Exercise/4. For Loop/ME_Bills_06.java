import java.util.Scanner;

public class ME_Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        double Electricity = 0.0;
        double Water = 0.0;
        double Internet = 0.0;
        double Other = 0.0;

        for (int month = 1; month <= months; month++) {
            double electric = Double.parseDouble(scanner.nextLine());
            Electricity += electric;
            Water += 20;
            Internet += 15;
            Other += (electric + 20 + 15) * 1.20;
        }
        double avarage = (Electricity + Water + Internet + Other) / months;
        System.out.printf("Electricity: %.2f lv%n", Electricity);
        System.out.printf("Water: %.2f lv%n", Water);
        System.out.printf("Internet: %.2f lv%n", Internet);
        System.out.printf("Other: %.2f lv%n", Other);
        System.out.printf("Average: %.2f lv", avarage);
    }
}
