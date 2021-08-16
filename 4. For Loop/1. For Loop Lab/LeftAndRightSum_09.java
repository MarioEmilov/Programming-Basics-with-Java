import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum = leftSum + scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            rightSum = rightSum + scanner.nextInt();
        }

        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            int difference = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + difference);
        }
    }
}
