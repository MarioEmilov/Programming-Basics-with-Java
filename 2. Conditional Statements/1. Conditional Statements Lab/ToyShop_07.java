import java.util.Scanner;

public class ToyShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holiday = Double.parseDouble(scanner.nextLine());
        double puzzles = Double.parseDouble(scanner.nextLine());
        double dolls = Double.parseDouble(scanner.nextLine());
        double bears = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());
        //пъзел - 2.60 лв
        //кукла - 3 лв
        //мече - 4.10 лв
        //минйон - 8.20 лв
        //камион - 2 лв

        double sum = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        if ((puzzles + dolls + bears + minions + trucks) >= 50) {
            double discount = sum * 0.25;
            double sumDiscount = sum - discount;
            double rent = sumDiscount * 0.10;
            double total = sumDiscount - rent;

            if (total > holiday){
                double money = total - holiday;
                System.out.printf("Yes! %.2f lv left.", money);
            } else {
                double needed = holiday - total;
                System.out.printf("Not enough money %.2f lv needed.", needed);
            }
        } else {
            double rent = sum * 0.10;
            double totalWithoutDiscount = sum - rent;

            if (totalWithoutDiscount >= holiday) {
                double leftMoney = totalWithoutDiscount - holiday;
                System.out.printf("Yes! %.2f lv left.", leftMoney);
            } else {
                double neededMoney = holiday - totalWithoutDiscount;
                System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
            }

        }

    }
}
