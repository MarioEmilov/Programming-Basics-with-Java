import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String titleBook = scanner.nextLine();
        String input = scanner.nextLine();

        int countBook = 0;
        boolean wasFound = false;

        while (!input.equals("No More Books")) {
            if (titleBook.equals(input)) {
                wasFound = true;
                break;
            }
            countBook++;
            input = scanner.nextLine();
        }
        if (wasFound) {
            System.out.printf("You checked %d books and found it.", countBook);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBook);
        }
    }
}
