/** Integer division differs from floating-point division. */
public class JavaOperators {
    public static void main(String[] args) {
        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7 / 2.0 = " + (7 / 2.0));
        System.out.println("7 % 2 = " + (7 % 2));
        int score = 85;
        System.out.println("Passing score: " + (score >= 50 && score <= 100));
        System.out.println("Same text: " + "Java".equals(new String("Java")));
        // Use equals for String content; == compares reference identity.
    }
}
