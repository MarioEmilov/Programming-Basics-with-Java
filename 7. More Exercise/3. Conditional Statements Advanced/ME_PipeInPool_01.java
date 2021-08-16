import java.util.Scanner;

public class ME_PipeInPool_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double p1PerH = P1 * H;
        double p2PerH = P2 * H;
        double bothPipesPerH = p1PerH + p2PerH;
        double bothPipesPercent = (bothPipesPerH * 100) / V;
        double p1Percent = (p1PerH * 100) / bothPipesPerH;
        double p2Percent = (p2PerH * 100) / bothPipesPerH;


        if (bothPipesPerH <= V){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", bothPipesPercent, p1Percent, p2Percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f litres.", H, bothPipesPerH - V);
        }
    }
}
