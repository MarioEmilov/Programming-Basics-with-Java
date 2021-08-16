import java.util.Scanner;

public class WorldSnookerChampionship_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfChampionship = scanner.nextLine().toLowerCase();
        String typeOfTicket = scanner.nextLine().toLowerCase();
        int countOfTickets = Integer.parseInt(scanner.nextLine());
        String pictureWithTrophy = scanner.nextLine().toLowerCase();
        double totalPrice = 0;
        double picturePrice = 0;

        switch (typeOfChampionship){
            case "final":
                if (typeOfTicket.equals("premium")){
                    totalPrice = countOfTickets * 160.66;
                }
                else if (typeOfTicket.equals("standard")) {
                    totalPrice = countOfTickets * 110.10;
                }
                else if (typeOfTicket.equals("vip")) {
                    totalPrice = countOfTickets * 400;
                }
                break;
            case "semi final":
                if (typeOfTicket.equals("premium")){
                    totalPrice = countOfTickets * 125.22;
                }
                else if (typeOfTicket.equals("standard")) {
                    totalPrice = countOfTickets * 75.88;
                }
                else if (typeOfTicket.equals("vip")) {
                    totalPrice = countOfTickets * 300.40;
                }
                break;
            case "quarter final":
                if (typeOfTicket.equals("premium")){
                    totalPrice = countOfTickets * 105.20;
                }
                else if (typeOfTicket.equals("standard")) {
                    totalPrice = countOfTickets * 55.50;
                }
                else if (typeOfTicket.equals("vip")) {
                    totalPrice = countOfTickets * 118.90;
                }
                break;
            default:{
                break;
            }
        }

        if (totalPrice > 4000) {
            totalPrice = 0.75 * totalPrice;
            System.out.printf("%.2f", totalPrice);
        } else if (totalPrice > 2500) {
            totalPrice *= 0.9;

            if (pictureWithTrophy.equals("y")) {
                picturePrice = countOfTickets * 40;
                totalPrice += picturePrice;
                System.out.printf("%.2f", totalPrice);
            } else {
                System.out.printf("%.2f", totalPrice);
            }
        } else {
            if (pictureWithTrophy.equals("y")) {
                picturePrice = countOfTickets * 40;
                totalPrice += picturePrice;
                System.out.printf("%.2f", totalPrice);
            } else {
                System.out.printf("%.2f", totalPrice);
            }
        }
    }
}
