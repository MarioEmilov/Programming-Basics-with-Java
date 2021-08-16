import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kozunak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int kurabiiki = Integer.parseInt(scanner.nextLine());


        double cenaKozunak = kozunak * 3.20;
        double cenaEggs = eggs * 4.35;
        double cenaKurabiiki = kurabiiki * 5.40;
        double boq = eggs * 12 * 0.15;
        double total = boq + cenaKozunak + cenaEggs + cenaKurabiiki;
        System.out.printf("%.2f", total);
    }
}
