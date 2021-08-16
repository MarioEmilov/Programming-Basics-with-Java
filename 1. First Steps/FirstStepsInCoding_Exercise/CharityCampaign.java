import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int campaignDays = Integer.parseInt(scanner.nextLine());
        int countCook = Integer.parseInt(scanner.nextLine());
        int countCakes = Integer.parseInt(scanner.nextLine());
        int countWaffles = Integer.parseInt(scanner.nextLine());
        int countPancakes = Integer.parseInt(scanner.nextLine());

        //Торта - 45 лв.
        //Гофрета - 5.80лв.
        //Палачинка - 3.20лв.

        double sumCakes = countCakes * 45.0;
        double sumWaffles = countWaffles * 5.80;
        double sumPancakes = countPancakes * 3.20;

        double allCookPerDay = (sumCakes + sumWaffles + sumPancakes) * countCook;
        double totalSum = allCookPerDay * campaignDays;

        double result = totalSum - (totalSum / 8);
        System.out.printf("%.2f", result);
    }
}