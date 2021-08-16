import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        //страната на квадрата --> вход --> променлива
        //лицето = страната * страната
        //печатаме лицето
        Scanner scanner = new Scanner(System.in);
        int squareSide = Integer.parseInt(scanner.nextLine());
        int squareArea = squareSide * squareSide;
        System.out.println(squareArea);
    }
}
