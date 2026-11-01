# Java operators

| Group | Examples | Meaning |
|---|---|---|
| Arithmetic | `+ - * / %` | Add, subtract, multiply, divide, remainder |
| Comparison | `== != < <= > >=` | Compare values and produce a boolean |
| Logical | `&& || !` | Combine or negate conditions |
| Assignment | `= += -=` | Store or update a value |

```java
int total = 10 + 5;
boolean passed = total >= 10 && total <= 20;
total += 2;
```

Use parentheses when they make the intended order clearer. `&&` and `||`
short-circuit: the right operand is evaluated only if it can change the result.
For String content use `equals`; `==` compares object reference identity.

Run [JavaOperators](../../Java/Tutorials/src/JavaOperators.java). Predict each
line before executing it, especially the two division examples.
