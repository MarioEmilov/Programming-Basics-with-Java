import java.util.Scanner;

public class ME_Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalTons = 0;
        int priceMikrobus = 0;
        int countTonsMikrobus = 0;
        int priceKamion = 0;
        int countTonsKamion = 0;
        int priceTrain = 0;
        int countTonsTrain = 0;

        for (int tovar = 1; tovar <= n; tovar++) {
            int value = Integer.parseInt(scanner.nextLine());
            totalTons += value;
            if (value <= 3) {
                priceMikrobus += value * 200;
                countTonsMikrobus += value;
            } else if (value <= 11) {
                priceKamion += value * 175;
                countTonsKamion += value;
            } else if (value >= 12) {
                priceTrain += value * 120;
                countTonsTrain += value;
            }
        }
        double sredno = (priceMikrobus * 1.0 + priceKamion * 1.0 + priceTrain * 1.0) / totalTons;
        double procentMicrobus = (countTonsMikrobus * 1.0) / totalTons * 100;
        double procentKamion = (countTonsKamion * 1.0) / totalTons * 100;
        double procentTrain = (countTonsTrain * 1.0) / totalTons * 100;
        System.out.printf("%.2f%n", sredno);
        System.out.printf("%.2f%%%n", procentMicrobus);
        System.out.printf("%.2f%%%n", procentKamion);
        System.out.printf("%.2f%%%n", procentTrain);
    }
}
