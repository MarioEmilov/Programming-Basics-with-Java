import java.util.Scanner;

public class GraduationPt2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        int rejectCount = 0;
        double totalScore = 0.0;

        while (grade <= 12) {
            double score = Double.parseDouble(scanner.nextLine());
            if (score < 4) {
                rejectCount ++;
                if (rejectCount == 2) {
                    break;
                }
                continue;
            }
            totalScore += score;
            grade++;
        }
        if (rejectCount == 2) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else {
            double average = totalScore / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name,average);
        }
    }
}
