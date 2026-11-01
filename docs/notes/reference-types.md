# Primitive values and reference values

A primitive variable contains a primitive value. A reference variable contains
a reference to an object or `null`; its declared type determines the operations
the compiler allows. Classes, interfaces and arrays are reference types.

Assigning one reference variable to another does not copy the object:

```java
StringBuilder first = new StringBuilder("Hello");
StringBuilder second = first;
second.append(" Java");
System.out.println(first); // Hello Java
```

Objects can contain both primitive fields and reference fields. Their size is
not fixed merely because they are reference types; it depends on the class and
runtime layout. Java passes all arguments by value. When an argument is an object
reference, the copied value still refers to the same object.

Strings are immutable, so methods such as `toUpperCase()` return another String
rather than modifying the original. A reference can be null, so avoid calling a
method until you know there is an object to call it on.

Run [ReferenceTypes](../../Java/Tutorials/src/ReferenceTypes.java) and
[ClassesAndObjects](../../Java/Tutorials/src/ClassesAndObjects.java).
