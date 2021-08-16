import java.util.Scanner;

public class BasketballEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());

        double kecove = tax * 0.60;
        double ekip = kecove * 0.80;
        double topka = ekip * 0.25;
        double aksisuari = topka * 0.20;
        double total = kecove + ekip + topka + aksisuari + tax;
        System.out.printf("%.2f", total);
    }
}
