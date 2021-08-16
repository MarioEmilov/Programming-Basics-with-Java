package ProgrammingBasics;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        //викаме сканер и взимаме стойностите от конзолата
        Scanner scan = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scan.nextLine());
        double bananas = Double.parseDouble(scan.nextLine());
        double oranges = Double.parseDouble(scan.nextLine());
        double raspberries = Double.parseDouble(scan.nextLine());
        double strawberries = Double.parseDouble(scan.nextLine());

        //изчисляваме останалите цени
        double raspberriesPrice = strawberriesPrice * 0.50;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;
        //смятаме цялата сума и вадим отговор

        double total = strawberries * strawberriesPrice + bananasPrice * bananas + oranges * orangesPrice + raspberries * raspberriesPrice;
        System.out.printf("%.2f", total);
    }
}