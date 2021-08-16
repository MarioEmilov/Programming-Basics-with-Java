import java.util.Scanner;

public class SumNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //повтарямее: прочитаме от конзолата стойност на числото -> сумираме
        //начало: 1-вото поред число
        //край: n-тото поред число
        //всеки път го увеличаваме с 1
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0; //сумата на числата
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }
        System.out.println(sum);
    }
}
