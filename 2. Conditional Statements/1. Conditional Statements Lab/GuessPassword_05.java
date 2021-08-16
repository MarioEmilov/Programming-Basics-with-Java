import java.util.Scanner;

public class GuessPassword_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. парола -> String -> вход
        //2. ако паролата е "sad29221d" -> Welcome
        //3. -> в противен случай -> "Wrong password!"
        String password = scanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
