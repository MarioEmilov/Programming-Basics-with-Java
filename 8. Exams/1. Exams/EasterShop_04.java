import java.util.Scanner;

public class EasterShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsInShop = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int soldEggs = 0;

        while (!input.equals("Close")) {
                if (input.equals("Buy")) {
                int buyEggs = Integer.parseInt(scanner.nextLine());
                if (eggsInShop < buyEggs) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", eggsInShop);
                    break;
                } else {
                    eggsInShop -= buyEggs;
                    soldEggs += buyEggs;
                }
            } else if (input.equals("Fill")) {
                int buyEggs = Integer.parseInt(scanner.nextLine());
                eggsInShop += buyEggs;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", soldEggs);
        }
    }
}
