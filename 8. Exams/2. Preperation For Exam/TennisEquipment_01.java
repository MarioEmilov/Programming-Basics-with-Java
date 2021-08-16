import java.util.Scanner;

public class TennisEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raketa = Double.parseDouble(scanner.nextLine());
        int brRaketi = Integer.parseInt(scanner.nextLine());
        int brMaratonki = Integer.parseInt(scanner.nextLine());

        double cenaRaketa = raketa * brRaketi;
        double cenaMaratonki = raketa / 6;
        double cenaVsi4kiMaratonki = cenaMaratonki * brMaratonki;
        double cenaOstanaloOborudvane = (cenaRaketa + cenaVsi4kiMaratonki) * 0.2;
        double total = cenaRaketa + cenaVsi4kiMaratonki + cenaOstanaloOborudvane;
        double cenaDjoko = total / 8;
        double cenaSponsori = total * 7 / 8;
        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(cenaDjoko));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(cenaSponsori));
    }
}