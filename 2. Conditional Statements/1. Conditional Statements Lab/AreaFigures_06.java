import java.util.Scanner;

public class AreaFigures_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //име на фигура -> квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle)
        String type = scanner.nextLine();
        if (type.equals("square")) {
            //страна на квадрата
            //лице -> страна * страна
            //отпечатваме до 3 знак
            double a = Double.parseDouble(scanner.nextLine());
            double squareArea = a * a;
            System.out.printf("%.3f", squareArea);
        } else if (type.equals("rectangle")) {
            //страните на правоъгълник - 2 числа
            //лице -> страната * другата страна
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double rectangleAre = sideA * sideB;
            System.out.printf("%.3f", rectangleAre);
        } else if (type.equals("circle")) {
            //радиус
            //радиус -> Пи * радиус * радиус
            double radius = Double.parseDouble(scanner.nextLine());
            double circleArea = Math.PI * radius * radius;
            System.out.printf("%.3f", circleArea);
        } else if (type.equals("triangle")) {
            //страна и височина
            //страната * височина / 2
            double b = Double.parseDouble(scanner.nextLine());
            double hb = Double.parseDouble(scanner.nextLine());
            double triangleArea = b * hb / 2;
            System.out.printf("%.3f", triangleArea);
        }
    }
}
