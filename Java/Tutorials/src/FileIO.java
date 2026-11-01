import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/** The demo uses a temporary directory so it cannot overwrite your own notes. */
public class FileIO {
    public static List<String> roundTrip(List<String> lines) throws IOException {
        Path directory = Files.createTempDirectory("learn-java-");
        Path file = directory.resolve("days.txt");
        try {
            Files.write(file, lines, StandardCharsets.UTF_8);
            return Files.readAllLines(file, StandardCharsets.UTF_8);
        } finally {
            Files.deleteIfExists(file);
            Files.deleteIfExists(directory);
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> days = java.util.Arrays.asList("Monday", "Tuesday", "Wednesday");
        System.out.println("Read: " + roundTrip(days));
    }
}
