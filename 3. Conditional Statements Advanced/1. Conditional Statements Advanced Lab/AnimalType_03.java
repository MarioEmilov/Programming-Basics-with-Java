import java.util.Scanner;

public class AnimalType_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // animal and if animal is Dog -> mammal
        // crocodile, tortoise, snake -> reptile
        // others -> unknown
        String animalName = scanner.nextLine();
        switch (animalName) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
