import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/** A map associates keys with values; LinkedHashMap preserves insertion order. */
public class Collections {
    public static Map<String, Integer> wordCounts(String text) {
        if (text == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        Map<String, Integer> counts = new LinkedHashMap<>();
        if (text.trim().isEmpty()) {
            return counts;
        }
        // This example splits on whitespace; punctuation remains part of a word.
        for (String word : text.toLowerCase(Locale.ROOT).trim().split("\\s+")) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        System.out.println(wordCounts("Java Python java C"));
    }
}
