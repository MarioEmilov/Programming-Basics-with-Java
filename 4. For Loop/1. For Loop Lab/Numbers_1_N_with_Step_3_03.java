import java.util.Scanner;

public class Numbers_1_N_with_Step_3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //повтаряме: печатаме числото
        //начало: 1
        //край: n
        //всеки път увеличавам с 3
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number += 3) {
            System.out.println(number);
        }
    }
}
