import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Взимаме етажите от последния към първия
        //2. За всеки един етаж -> стаите от 0 до последната
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor >= 1; floor--) {
            for (int room = 0; room < rooms; room++) {
                //{буква за типа на стаята}{етаж}{номер на стая}
                if (floor == floors) {
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 1) {
                    System.out.printf("A%d%d ", floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);
                }
            }
            System.out.println();
        }
    }
}
