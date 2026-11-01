# Common Java mistakes

## `javac` is not found

Install a JDK, not just a Java runtime, and reopen your terminal. Check both
`java -version` and `javac -version`. This course uses JDK 17+.

## The public class name does not match the filename

`public class HelloWorld` belongs in `HelloWorld.java`, with the same capitalization.
The extensionless reference notes have moved to `docs/notes/`; do not compile them.

## `Could not find or load main class`

Compile the sources first. Run from the repository root with the compiled-output
directory on the classpath: `java -cp Java/Tutorials/bin HelloWorld`. Do not include
`.java` or `.class` after the class name in that command.

## Division loses the fraction

`7 / 2` uses integer division and produces `3`. Use `7 / 2.0` for `3.5`, or cast an
operand before division. Casting the already-truncated result is too late.

## Two equal strings compare as different

`==` checks whether references point to the same object. Use `first.equals(second)`
for String content, or `java.util.Objects.equals(first, second)` if null is possible.

## Array indexes fail

The last index is `values.length - 1`. A loop over indexes normally uses
`index < values.length`, not `<=`. An empty array has no first element.

## A copied object seems to change both variables

Assignment copies a reference, not the object. See `ReferenceTypes`. Java always
passes arguments by value; for an object argument, that value is a reference.

## Assertions do not run

The Java `assert` keyword needs `-ea` to enable it. This course's `LearningChecks`
throws `AssertionError` explicitly, so the check command does not rely on `-ea`.
