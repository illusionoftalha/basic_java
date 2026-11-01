import java.util.Locale;

/** Mini-project: validate command-line scores and calculate a summary. */
public class Gradebook {
    public static String letterGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("scores must be between 0 and 100");
        }
        if (score >= 80) { return "A"; }
        if (score >= 70) { return "B"; }
        if (score >= 60) { return "C"; }
        if (score >= 50) { return "D"; }
        return "F";
    }

    public static double average(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("at least one score is required");
        }
        long sum = 0;
        for (int score : scores) {
            letterGrade(score); // Apply the same validation to every entry.
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static void main(String[] args) {
        try {
            int[] scores;
            if (args.length == 0) {
                scores = new int[] {72, 85, 93};
            } else {
                scores = new int[args.length];
                for (int index = 0; index < args.length; index++) {
                    scores[index] = Integer.parseInt(args[index]);
                }
            }
            double result = average(scores);
            for (int score : scores) {
                System.out.println(score + ": " + letterGrade(score));
            }
            System.out.printf(Locale.ROOT, "Average: %.2f%n", result);
            System.out.println("Highest: " + Arrays.maximum(scores));
        } catch (IllegalArgumentException error) {
            System.err.println("Error: " + error.getMessage());
            System.err.println("Usage: java -cp Java/Tutorials/bin Gradebook 72 85 93");
            System.exit(2);
        }
    }
}
