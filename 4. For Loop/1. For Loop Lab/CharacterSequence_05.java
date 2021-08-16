import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        for (int position = 0; position <= text.length(); position++) {
            char letter = text.charAt(position); // System.out.println(text.charArt(position));
            System.out.println(letter);
        }
    }
}
