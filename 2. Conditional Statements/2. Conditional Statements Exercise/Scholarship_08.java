import javax.swing.*;
import java.util.Scanner;

public class Scholarship_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double incomeBGN = Double.parseDouble(scanner.nextLine());
        double avGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socScholarship = 0;
        double scholarship = 0;

        if (avGrade <= 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (avGrade < 5.50) {
            if (incomeBGN < minSalary) {
                socScholarship = Math.floor(0.35 * minSalary);
                System.out.printf("You get a Social scholarship %.0f BGN", socScholarship);
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else {
            scholarship = Math.floor(avGrade * 25);
            if (incomeBGN < minSalary) socScholarship = Math.floor(0.35 * minSalary);
            if (socScholarship > scholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", socScholarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarship);
            }
        }
    }
}
