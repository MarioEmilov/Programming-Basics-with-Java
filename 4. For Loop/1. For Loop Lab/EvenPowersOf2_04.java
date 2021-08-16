import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //повтаряме: печатаме 2 на определената степен
        //начало: 0
        //край: n
        //всеки път го увеличавам с 2
        int n = Integer.parseInt(scanner.nextLine());
        //System.out.println(Math.pow(10, 5)); десет на пета степен
        for (int step = 0; step <= n; step += 2) {
            System.out.printf("%.0f%n", Math.pow(2, step));
        }
    }
}
