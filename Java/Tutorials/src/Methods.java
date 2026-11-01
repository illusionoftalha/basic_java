/** Methods give a name to reusable work and can return a value. */
public class Methods {
    public static long factorial(int number) {
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("number must be between 0 and 20");
        }
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("0! = " + factorial(0));
        System.out.println("5! = " + factorial(5));
        // 21! exceeds long's range, so the method rejects it instead of overflowing.
    }
}
