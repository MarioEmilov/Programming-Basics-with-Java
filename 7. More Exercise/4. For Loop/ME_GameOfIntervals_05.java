import java.util.Scanner;

public class ME_GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double first = 0.0;
        double second = 0.0;
        double third = 0.0;
        double forth = 0.0;
        double fifth = 0.0;
        double unvalid = 0.0;
        double points = 0.0;

        for (int vhod = 1; vhod <= n; vhod++) {
            int nextImput = Integer.parseInt(scanner.nextLine());
            if (nextImput >= 0 && nextImput <=9) {
                points += nextImput * 0.20;
                first++;
            } else if (nextImput >= 10 && nextImput <= 19) {
                points += nextImput * 0.30;
                second++;
            } else if (nextImput >= 20 && nextImput <= 29) {
                points += nextImput * 0.40;
                third++;
            } else if (nextImput >= 30 && nextImput <= 39) {
                points += 50;
                forth++;
            } else if (nextImput >= 40 && nextImput <= 50) {
                points += 100;
                fifth++;
            } else if (nextImput < 0 || nextImput > 50) {
                points = points / 2;
                unvalid++;
            }

        }
        double procentFirst = first / n * 100;
        double procentSecond = second / n * 100;
        double procentThird = third/ n * 100;
        double procentFourth = forth / n * 100;
        double procentFifth = fifth / n * 100;
        double procentUnvalid = unvalid / n * 100;

        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", procentFirst);
        System.out.printf("From 10 to 19: %.2f%%%n", procentSecond);
        System.out.printf("From 20 to 29: %.2f%%%n", procentThird);
        System.out.printf("From 30 to 39: %.2f%%%n", procentFourth);
        System.out.printf("From 40 to 50: %.2f%%%n", procentFifth);
        System.out.printf("Invalid numbers: %.2f%%", procentUnvalid);
    }
}
