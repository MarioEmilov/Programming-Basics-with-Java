import java.util.Scanner;

public class DivideWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //група 1 -> числа, които се делят на 2
        //група 2 -> числа, които се делят на 3
        //група 3 -> числа, които се делят на 4

        int count1 = 0; //броя на числата в първата група
        int count2 = 0; //броя на числата във втората група
        int count3 = 0; //броя на числата в третата група

        for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            //проверките са отделни защото едно число може да попадне в повече от една група и искаме да видим дали е така (иначе ще бъде пропуснато)
            //проверка за група 1
            if (value % 2 == 0) {
                count1++;
            }
            //проверка за група 2
            if (value % 3 == 0) {
                count2++;
            }
            //проверка за група 3
            if (value % 4 == 0) {
                count3++;
            }
        }
        //пресмятаме процента числа, които се намират във всяка група -> (бр / общ бр) * 100 преобразуваме в процент
        double p1 = count1 * 1.0 / n * 100;
        double p2 = count2 * 1.0 / n * 100;
        double p3 = count3 * 1.0 / n * 100;

        //отпечатваме % на всички групи
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
    }
}
