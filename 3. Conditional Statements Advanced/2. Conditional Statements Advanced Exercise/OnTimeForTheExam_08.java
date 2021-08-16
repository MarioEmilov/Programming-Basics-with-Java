import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int totalExamMinutes = (examHour * 60) + examMinutes;
        int totalArrivalMinutes = (arriveHour * 60) + arriveMinute;
        int diff = Math.abs(totalArrivalMinutes - totalExamMinutes);

        int hours = 0;
        int minutes = 0;

        if(totalArrivalMinutes > totalExamMinutes){
            System.out.println("Late");
            if(diff < 60){
                System.out.printf("%d minutes after the start", diff);
            } else {
                hours = diff / 60;
                minutes = diff % 60;
                if (minutes < 10){
                    System.out.printf("%d:0%d hours after the start", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours after the start", hours, minutes);
                }
            }
        }else if(totalArrivalMinutes == totalExamMinutes || diff <= 30){
            System.out.println("On time");
            if (diff != 0){
                System.out.printf("%d minutes before the start", diff);
            }

        } else {
            if(diff < 60){
                System.out.println("Early");
                System.out.printf("%d minutes before the start", diff);
            } else {
                hours = diff / 60;
                minutes = diff % 60;
                System.out.println("Early");
                if (minutes < 10){
                    System.out.printf("%d:0%d hours before the start", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours before the start", hours, minutes);
                }
            }
        }
    }
}

