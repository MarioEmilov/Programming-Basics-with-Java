import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brDog = Integer.parseInt(scanner.nextLine());
        int ostanaliPets = Integer.parseInt(scanner.nextLine());
        double cenaDog = brDog * 2.50;
        int cenaPets = ostanaliPets * 4;
        double cenaObshto = cenaDog + cenaPets;
        System.out.println(cenaObshto + "lv.");
    }
}
