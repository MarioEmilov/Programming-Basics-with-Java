import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //команда -> дестинация или end
        String command = scanner.nextLine();
        //спираме: command == "end"
        //продължаваме: command != "end"

        while(!command.equals("End")) {
            //дестинация
            double budget = Double.parseDouble(scanner.nextLine());
            double money = 0;
            //спестява
            //спира: парите >= бюджета
            //продължава: парите < бюджета
            while (money < budget) {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                money += savedMoney;
            }

            System.out.println("Going to " + command + "!");

            command = scanner.nextLine();
        }
    }
}