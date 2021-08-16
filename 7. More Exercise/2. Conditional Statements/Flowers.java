import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();   //Spring, Summer, Аutumn, Winter
        String holiday = scanner.nextLine();   //Y – да / N - н

        double sumFlowers = 0;
        if (season.equals("Spring") || season.endsWith("Summer")){
            sumFlowers = hrizantemi * 2.00 + roses * 4.10 + tulips * 2.50;
        } else if(season.equals("Autumn") || season.endsWith("Winter")){
            sumFlowers = hrizantemi * 3.75 + roses * 4.50 + tulips * 4.15 ;
        }

        if (holiday.equals("Y")){
            sumFlowers = sumFlowers + sumFlowers*0.15;
            if(season.equals("Spring") && tulips>7){
                sumFlowers = sumFlowers - 0.05*sumFlowers;
            }else if(season.equals("Winter") && roses >=10){
                sumFlowers = sumFlowers - 0.10*sumFlowers;
            }
        }
        else if (holiday.equals("N")){
            if(season.equals("Spring") && tulips>7){
                sumFlowers = sumFlowers - 0.05*sumFlowers;
            }else if(season.equals("Winter") && roses >=10){
                sumFlowers = sumFlowers - 0.10*sumFlowers;
            }
        }

        if((hrizantemi + roses + tulips) > 20) {
            sumFlowers = sumFlowers - 0.20 * sumFlowers;
        }

        sumFlowers = sumFlowers + 2;   //2.00 lv za aranjirane
        System.out.printf("%.2f", sumFlowers);


    }
}
