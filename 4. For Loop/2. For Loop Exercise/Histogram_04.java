import java.util.Scanner;

public class Histogram_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //група 1 -> < 200
        //група 2 -> >= 200 и <= 399
        //група 3 -> >= 400 и <= 599
        //група 4 -> >= 600 и <= 799
        //група 5 -> >= 800
        int n = Integer.parseInt(scanner.nextLine());

        int count1 = 0; //броя на числата в първата група
        int count2 = 0; //броя на числата във втората група
        int count3 = 0; //броя на числата в третата група
        int count4 = 0; //броя на числата в четвъртата група
        int count5 = 0; //броя на числата в петата група

        //за всяко едно n число трябва да прочетем и да направим проверка в коя група е
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value < 200) {
                count1++;
            } else if (value >= 200 && value <= 399) {
                count2++;
            } else if (value >= 400 && value <= 599) {
                count3++;
            } else if (value >= 600 && value <= 799) {
                count4++;
            } else if (value >= 800) {
                count5++;
            }
        }
        //пресмятаме процента числа, които се намират във всяка група -> (бр / общ бр) * 100 преобразуваме в процент
        double p1 = count1 * 1.0 / n * 100;
        double p2 = count2 * 1.0 / n * 100;
        double p3 = count3 * 1.0 / n * 100;
        double p4 = count4 * 1.0 / n * 100;
        double p5 = count5 * 1.0 / n * 100;

        //отпечатваме % на всички групи
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
