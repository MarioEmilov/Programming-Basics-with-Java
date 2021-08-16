import java.util.Scanner;

public class SkiTrip_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. крайна цена = бр. нощувки (дни - 1) * цена за 1 нощувка (зависи от типа на стая)
        //2. намаление на крайната цена -> вид на стаята и броя нощувки
        //3. намаление спрямо мнението за хотела
        //4. печатаме крайната цена след намаленията
        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();

        //1. крайната цена

        int nights = days - 1;
        double pricePerNight = 0;

        if (typeRoom.equals("room for one person")) {
            pricePerNight = 18;
        } else if (typeRoom.equals("apartment")) {
            pricePerNight = 25;
        } else if (typeRoom.equals("president apartment")) {
            pricePerNight = 35;
        }

        double finalSum = nights * pricePerNight;

        //2.намаление на крайната цена

        switch (typeRoom) {
            case "apartment":
                if (nights < 10) {
                    finalSum = finalSum - (0.30 * finalSum); //finalSum = finalSum * 0.70;
                } else if (nights >= 10 && nights <= 15) {
                    finalSum = finalSum - (0.35 * finalSum); //finalSum = finalSum * 0.65;
                } else if (nights > 15) {
                    finalSum = finalSum - (0.50 * finalSum); //finalSum = finalSum * 0.50;
                }
                break;
            case "president apartment":
                if (nights < 10) {
                    finalSum = finalSum - (0.10 * finalSum); //finalSum = finalSum * 0.90;
                } else if (nights >= 10 && nights <= 15) {
                    finalSum = finalSum - (0.15 * finalSum); //finalSum = finalSum * 0.85;
                } else if (nights > 15) {
                    finalSum = finalSum - (0.20 * finalSum); //finalSum = finalSum * 0.80;
                }
                break;
        }

        //3. намаление спрямо мнението за хотела

        if (grade.equals("positive")) {
            finalSum = finalSum + (0.25 * finalSum); //finalSum = finalSum * 1.25;
        } else if (grade.equals("negative")) {
            finalSum = finalSum - (0.10 * finalSum); //finalSum = finalSum * 0.80;
        }

        //4. печатаме крайната сума форматирана до втория знак

        System.out.printf("%.2f", finalSum);
    }
}
