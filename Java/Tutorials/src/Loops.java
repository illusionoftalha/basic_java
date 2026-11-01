/** for, enhanced for and while loops all repeat work with different controls. */
public class Loops {
    public static void main(String[] args) {
        for (int number = 1; number <= 5; number++) {
            System.out.printf("3 x %d = %d%n", number, 3 * number);
        }
        int remaining = 3;
        while (remaining > 0) {
            System.out.println("Countdown: " + remaining);
            remaining--;
        }
    }
}
