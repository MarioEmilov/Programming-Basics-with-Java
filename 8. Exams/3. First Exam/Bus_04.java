import java.util.Scanner;

public class Bus_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPeople = Integer.parseInt(scanner.nextLine());
        int spirki = Integer.parseInt(scanner.nextLine());

        for (int spirka = 1; spirka <= spirki; spirka++) {
            int slizashti = Integer.parseInt(scanner.nextLine());
            int kachvashti = Integer.parseInt(scanner.nextLine());

            int proverqvashti = 2;
            if (spirka % 2 != 0) {
                startPeople -= slizashti;
                startPeople += kachvashti;
                startPeople += proverqvashti;
            } else {
                startPeople -= slizashti;
                startPeople += kachvashti;
                startPeople -= proverqvashti;
            }
        }
        System.out.printf("The final number of passengers is : %d", startPeople);
    }
}
