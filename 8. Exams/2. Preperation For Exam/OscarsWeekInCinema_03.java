import java.util.Scanner;

public class OscarsWeekInCinema_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String typeHall = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = 0;

        switch (movieName) {
            case "A Star Is Born":
                if (typeHall.equals("normal")) {
                    priceTicket = 7.50;
                } else if (typeHall.equals("luxury")){
                    priceTicket = 10.50;
                } else if (typeHall.equals("ultra luxury")) {
                    priceTicket = 13.50;
                }
                break;
            case  "Bohemian Rhapsody":
                if (typeHall.equals("normal")) {
                    priceTicket = 7.35;
                } else if (typeHall.equals("luxury")){
                    priceTicket = 9.45;
                } else if (typeHall.equals("ultra luxury")) {
                    priceTicket = 12.75;
                }
                break;
            case "Green Book":
                if (typeHall.equals("normal")) {
                    priceTicket = 8.15;
                } else if (typeHall.equals("luxury")){
                    priceTicket = 10.25;
                } else if (typeHall.equals("ultra luxury")) {
                    priceTicket = 13.25;
                }
                break;
            case "The Favourite":
                if (typeHall.equals("normal")) {
                    priceTicket = 8.75;
                } else if (typeHall.equals("luxury")){
                    priceTicket = 11.55;
                } else if (typeHall.equals("ultra luxury")) {
                    priceTicket = 13.95;
                }
                break;
        }
        double profit = countTickets * priceTicket;
        System.out.printf("%s -> %.2f lv.", movieName, profit);
    }
}
