import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLowGrade = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double sumGrades = 0.0;
        int problemsCount = 0;
        String lastProblemName = "";
        int countLowGrade = 0;
                                                                    //boolean flag = false;

        while (!input.equals("Enough")) {
            String problemName = input;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                countLowGrade++;
            }
            if (countLowGrade >= maxLowGrade) {
                                                                    //flag = true;
                break;
            }

            sumGrades += grade;
            lastProblemName = problemName;
            problemsCount++;
            input = scanner.nextLine();
        }
                                                                    //if (flag) { true and else is false }
        if (countLowGrade == maxLowGrade) {
            System.out.printf("You need a break, %d poor grades.", countLowGrade);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / problemsCount);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblemName);
        }
    }
}
