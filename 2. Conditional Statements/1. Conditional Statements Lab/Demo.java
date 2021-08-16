import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Сравнение
        String name = "Desi";
        String name1 = "desi";
        System.out.println(name.equals(name1));

        //boolean оператор и if
        Scanner scanner = new Scanner(System.in);
        int moneyInCard = 1000;
        int moneyWithdraw = Integer.parseInt(scanner.nextLine());
        //ако moneyInCard >= moneyWithdraw -> give
        if (moneyInCard >= moneyWithdraw){
            System.out.println("Successful");
        }

    }
}
