import java.util.Scanner;

public class ME_EqualParis_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sumOne = 0, sumTwo = 0, diff = 0;

        for (int i = 1; i <= n; i++) {
            int numOne = Integer.parseInt(sc.nextLine());
            int numTwo = Integer.parseInt(sc.nextLine());

            if (i % 2 == 0) {
                sumOne = numOne + numTwo;
            } else {
                sumTwo = numOne + numTwo;
            }

            if (Math.abs(sumOne - sumTwo) > diff && i > 1) {
                diff = Math.abs(sumOne - sumTwo);
            }
        }

        if (diff != 0) {
            System.out.println("No, maxdiff=" + diff);
        } else {
            System.out.println("Yes, value=" + sumTwo);   // използваме sumTwo, тъй като ако n = 1, стойността ще се запише там
        }
    }
}
