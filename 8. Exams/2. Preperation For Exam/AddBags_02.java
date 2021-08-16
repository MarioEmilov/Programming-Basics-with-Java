import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bagover20kg = Double.parseDouble(sc.nextLine()); //Цената на багаж над 20кг
        double bagweigth = Double.parseDouble(sc.nextLine()); //Килограми на багажа
        int daystilltravel = Integer.parseInt(sc.nextLine()); //Дни до пътуването
        int numberofbags = Integer.parseInt(sc.nextLine()); //Брой багажи
        //if statements
        if (bagweigth > 20) {
            double priceforbags = bagover20kg * numberofbags;

            if (daystilltravel > 30) {
                double finalprice00 = priceforbags + (priceforbags * 0.10);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice00);
            } else if (daystilltravel < 7) {
                double finalprice01 = priceforbags + (priceforbags * 0.40);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice01);
            } else {
                double finalprice02 = priceforbags + (priceforbags * 0.15);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice02);
            }

        } else if (bagweigth < 10) {
            double priceforbag = bagover20kg - (bagover20kg * 0.8);
            double priceforbags = priceforbag * numberofbags;

            if (daystilltravel > 30) {
                double finalprice10 = priceforbags + (priceforbags * 0.10);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice10);
            } else if (daystilltravel < 7) {
                double finalprice11 = priceforbags + (priceforbags * 0.40);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice11);
            } else {
                double finalprice12 = priceforbags + (priceforbags * 0.15);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice12);
            }

        } else {
            double priceforbag1 = bagover20kg / 2;
            double priceforbags = priceforbag1 * numberofbags;

            if (daystilltravel > 30) {
                double finalprice20 = priceforbags + (priceforbags * 0.10);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice20);

            } else if (daystilltravel < 7) {
                double finalprice21 = priceforbags + (priceforbags * 0.40);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice21);
            } else {
                double finalprice22 = priceforbags + (priceforbags * 0.15);
                System.out.printf("The total price of bags is: %.2f lv.", finalprice22);

            }
        }
    }
}
