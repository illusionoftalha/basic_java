/** Copying a reference does not make a second copy of its object. */
public class ReferenceTypes {
    public static void main(String[] args) {
        int original = 10;
        int copied = original;
        copied = 20;
        System.out.println("Primitive values: " + original + ", " + copied);

        StringBuilder first = new StringBuilder("Hello");
        StringBuilder second = first;
        second.append(" Java");
        System.out.println("Shared object: " + first);
    }
}
