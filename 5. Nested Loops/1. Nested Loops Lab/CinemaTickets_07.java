import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countTotalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            String command = scanner.nextLine();
            int counterTickets = 0;
            while (!command.equals("End")) {
                String typeTicket = command;
                switch (typeTicket) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }

                counterTickets++;
                countTotalTickets++;

                if (counterTickets == freeSeats) {
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, counterTickets * 1.0 / freeSeats * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / countTotalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidTickets * 1.0 / countTotalTickets * 100);
    }
}
