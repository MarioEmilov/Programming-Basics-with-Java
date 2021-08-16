import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metri = Double.parseDouble(scanner.nextLine());
        double price = metri * 7.61;
        double discount = price * 0.18;
        double finalprice = metri * 7.61 - discount;

        System.out.printf("The final price is: %f lv.", finalprice);
        System.out.printf("The discount is: %f lv.", discount);

    }
}
