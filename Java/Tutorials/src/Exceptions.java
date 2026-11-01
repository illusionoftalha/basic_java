/** Handle expected invalid input without hiding unrelated programming errors. */
public class Exceptions {
    public static int parseAge(String text) {
        if (text == null) {
            throw new IllegalArgumentException("age cannot be null");
        }
        int age = Integer.parseInt(text.trim());
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("age must be between 0 and 150");
        }
        return age;
    }

    public static void main(String[] args) {
        for (String text : new String[] {"18", "abc", "-1"}) {
            try {
                System.out.println("Accepted age: " + parseAge(text));
            } catch (IllegalArgumentException error) {
                System.out.println("Cannot use '" + text + "': " + error.getMessage());
            }
        }
    }
}
