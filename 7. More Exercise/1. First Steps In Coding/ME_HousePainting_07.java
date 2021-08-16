import java.util.Scanner;

public class ME_HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //От конзолата се четат 3 реда:
        //x – височината на къщата – реално число в интервала [2...100]
        //y – дължината на страничната стена – реално число в интервала [2...100]
        //h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]

        Double height = Double.parseDouble(scanner.nextLine());
        Double length = Double.parseDouble(scanner.nextLine());
        Double heightRoof = Double.parseDouble(scanner.nextLine());

        Double sideWall = height * length;
        Double sideWallsArea = sideWall * 2 - (2 * 1.5 * 1.5);

        Double frontSide = height*height;
        Double frontAftArea = frontSide * 2 - (1.2 * 2);

        Double greenArea = sideWallsArea + frontAftArea;
        Double greenPaint = greenArea / 3.4;

        Double sideRoofArea = (height * length) * 2;
        Double frontAftRoofArea = (heightRoof * height / 2) * 2;

        Double redArea = sideRoofArea + frontAftRoofArea;
        Double redPaint = redArea / 4.3;


        //Да се отпечатат на конзолата две числа всяко на нов ред:
        //Литрите зелена боя
        //Литритe червена боя
        //Форматирани до вторият знак след десетичната запетая.

        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f",redPaint);
    }
}
