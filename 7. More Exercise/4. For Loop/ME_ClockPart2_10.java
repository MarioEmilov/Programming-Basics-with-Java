public class ME_ClockPart2_10 {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                for (int sec = 0; sec <= 59; sec++) {
                    System.out.println(String.format("%d : %d : %d", hour, minute, sec));
                }
            }
        }
    }
}
