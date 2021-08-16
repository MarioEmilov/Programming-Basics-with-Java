import java.util.Scanner;

public class ME_FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacityStadium = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int A = 0;
        int B = 0;
        int V = 0;
        int G = 0;

        for (int fan = 1; fan <= fans; fan++) {
            String otbor = scanner.nextLine();
            if (otbor.equals("A")) {
                A++;
            } else if (otbor.equals("B")) {
                B++;
            } else if (otbor.equals("V")) {
                V++;
            } else if (otbor.equals("G")) {
                G++;
            }
        }
        double sectorA = A * 1.0 / fans * 100;
        double sectorB = B * 1.0 / fans * 100;
        double sectorC = V * 1.0 / fans * 100;
        double sectorD = G * 1.0 / fans * 100;
        double procentFenove = fans * 1.0/ capacityStadium * 100;

        System.out.printf("%.2f%%%n", sectorA);
        System.out.printf("%.2f%%%n", sectorB);
        System.out.printf("%.2f%%%n", sectorC);
        System.out.printf("%.2f%%%n", sectorD);
        System.out.printf("%.2f%%%n", procentFenove);
    }
}
