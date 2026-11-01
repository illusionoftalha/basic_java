# Java data types

Java has eight primitive types: `byte`, `short`, `int`, `long`, `float`, `double`,
`char` and `boolean`. A `String`, array or class instance is a reference type.

```java
int lessons = 3;
long population = 250_000_000L;
double average = 83.5;
char initial = 'T';
boolean learning = true;
String name = "Talha";
```

Choose a type for the values and operations you need. A floating-point value is
an approximation of many decimal fractions; do not expect arbitrary decimal
arithmetic to be exact. A char represents one UTF-16 code unit, which is not
always a whole displayed Unicode character.

Fields receive default values, but local variables must be assigned before use.
Integer division discards the fractional part: `7 / 2` is `3`; `7 / 2.0` is `3.5`.

Run [JavaDataTypes](../../Java/Tutorials/src/JavaDataTypes.java) and
[JavaNumbers](../../Java/Tutorials/src/JavaNumbers.java) to explore values.
