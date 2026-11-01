/** Arrays have a fixed length; indexes begin at zero. */
public class Arrays {
    public static int maximum(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("at least one value is required");
        }
        int maximum = values[0]; // Starting at 0 would fail for all-negative input.
        for (int value : values) {
            if (value > maximum) {
                maximum = value;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 90};
        for (int index = 0; index < scores.length; index++) {
            System.out.printf("Score %d: %d%n", index + 1, scores[index]);
        }
        System.out.println("Highest: " + maximum(scores));
    }
}
