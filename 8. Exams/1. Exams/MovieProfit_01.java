import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int forCinema = Integer.parseInt(scanner.nextLine());

        double profit = tickets * priceTicket;
        double profitDays = days * profit;
        double cinemaProfit = profitDays * forCinema / 100;
        double profitMovie = profitDays - cinemaProfit;
        System.out.printf("The profit from the movie %s is %.2f lv.", name, profitMovie);
    }
}
