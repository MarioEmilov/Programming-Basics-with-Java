import java.util.Scanner;

public class Read_Text_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("Stop")) {
                break;
            }
            System.out.println(name);
        }
    }
}
