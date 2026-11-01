# Java learning path

Use JDK 17 or newer and run commands from the repository root. Compile the
examples first using [the quick start](../README.md#quick-start).

| Step | Concept | Runnable class | Practice |
|---|---|---|---|
| 1 | Your first output | [HelloWorld](../Java/Tutorials/src/HelloWorld.java) | Print your own greeting. |
| 2 | Values and types | [JavaDataTypes](../Java/Tutorials/src/JavaDataTypes.java) | Add a long and explain its suffix. |
| 3 | Operators | [JavaOperators](../Java/Tutorials/src/JavaOperators.java) | Compare `7 / 2` with `7 / 2.0`. |
| 4 | Conditions | [IfElse](../Java/Tutorials/src/IfElse.java) and [SwitchStatements](../Java/Tutorials/src/SwitchStatements.java) | Add another branch. |
| 5 | Repetition | [Loops](../Java/Tutorials/src/Loops.java) | Change the table and countdown. |
| 6 | Fixed-size sequences | [Arrays](../Java/Tutorials/src/Arrays.java) | Find the smallest negative value. |
| 7 | Reusable methods | [Methods](../Java/Tutorials/src/Methods.java) | Explain why 21 is rejected. |
| 8 | Object references | [ReferenceTypes](../Java/Tutorials/src/ReferenceTypes.java) | Create an independent StringBuilder copy. |
| 9 | Key/value collections | [Collections](../Java/Tutorials/src/Collections.java) | Count words while ignoring punctuation. |
| 10 | Invalid input | [Exceptions](../Java/Tutorials/src/Exceptions.java) | Try an empty string and an age of 151. |
| 11 | Objects and state | [ClassesAndObjects](../Java/Tutorials/src/ClassesAndObjects.java) | Add a borrower name. |
| 12 | Text files | [FileIO](../Java/Tutorials/src/FileIO.java) | Round-trip a line containing accented characters. |
| Project | Gradebook | [Gradebook](../Java/Tutorials/src/Gradebook.java) | Add a median and test even/odd counts. |

For example:

```sh
java -cp Java/Tutorials/bin Methods
java -cp Java/Tutorials/bin Collections
java -cp Java/Tutorials/bin Gradebook 50 75 100
```

Expected highlights:

```text
0! = 1
5! = 120
{java=2, python=1, c=1}
50: D
75: B
100: A
Average: 75.00
Highest: 100
```

## Original examples

The earlier variable, boolean, string, casting, math and condition examples remain
in `Java/Tutorials/src/`. They compile alongside the new lessons. The older class
names are kept so existing commands still work. Some contain commented snippets;
the table above is the recommended sequence.

## Reference notes

- [Data types](notes/data-types.md)
- [Operators](notes/operators.md)
- [Reference types](notes/reference-types.md)

Next: work through the [practice lab](../exercises/README.md).
