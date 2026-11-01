/** Dependency-free regression checks. Failures throw even without java -ea. */
public class LearningChecks {
    private static int checks;

    private static void check(boolean condition, String message) {
        checks++;
        if (!condition) { throw new AssertionError(message); }
    }

    private static void rejects(Runnable operation, Class<? extends RuntimeException> expected) {
        checks++;
        try {
            operation.run();
        } catch (RuntimeException error) {
            if (expected.isInstance(error)) { return; }
            throw error;
        }
        throw new AssertionError("Expected " + expected.getSimpleName());
    }

    public static void main(String[] args) throws Exception {
        int[] scores = {0, 49, 50, 60, 70, 79, 80, 100};
        String[] grades = {"F", "F", "D", "C", "B", "B", "A", "A"};
        for (int index = 0; index < scores.length; index++) {
            check(Gradebook.letterGrade(scores[index]).equals(grades[index]), "grade boundary");
        }
        rejects(() -> Gradebook.letterGrade(-1), IllegalArgumentException.class);
        rejects(() -> Gradebook.letterGrade(101), IllegalArgumentException.class);
        rejects(() -> Gradebook.average(new int[0]), IllegalArgumentException.class);
        rejects(() -> Gradebook.average(null), IllegalArgumentException.class);
        rejects(() -> Gradebook.average(new int[] {80, -1}), IllegalArgumentException.class);
        check(Math.abs(Gradebook.average(new int[] {1, 2}) - 1.5) < 0.000001, "no integer division");
        check(Arrays.maximum(new int[] {-8, -3, -5}) == -3, "negative maximum");
        rejects(() -> Arrays.maximum(new int[0]), IllegalArgumentException.class);
        check(Methods.factorial(0) == 1, "zero factorial");
        check(Methods.factorial(20) == 2432902008176640000L, "largest supported factorial");
        rejects(() -> Methods.factorial(21), IllegalArgumentException.class);
        rejects(() -> Methods.factorial(-1), IllegalArgumentException.class);
        check(Collections.wordCounts("Java java PYTHON").get("java") == 2, "word grouping");
        check(Collections.wordCounts(" ").isEmpty(), "empty word list");
        check(Exceptions.parseAge(" 18 ") == 18, "trimmed input");
        rejects(() -> Exceptions.parseAge("abc"), IllegalArgumentException.class);
        rejects(() -> Exceptions.parseAge("151"), IllegalArgumentException.class);
        ClassesAndObjects.Book book = new ClassesAndObjects.Book(" Java ");
        check(book.getTitle().equals("Java"), "trimmed title");
        book.borrow();
        rejects(book::borrow, IllegalStateException.class);
        book.returnBook();
        check(!book.isBorrowed(), "return restores availability");
        rejects(() -> new ClassesAndObjects.Book(" "), IllegalArgumentException.class);
        java.util.List<String> lines = java.util.Arrays.asList("Café", "Java");
        check(FileIO.roundTrip(lines).equals(lines), "UTF-8 file round trip");
        System.out.println("Passed " + checks + " checks.");
    }
}
