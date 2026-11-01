# Learn Java by building small programs

[![Java checks](https://github.com/illusionoftalha/basic_java/actions/workflows/check.yml/badge.svg)](https://github.com/illusionoftalha/basic_java/actions/workflows/check.yml)

**An ordered learning path · runnable examples · a gradebook project · no dependencies**

Learn the fundamentals one short program at a time, from your first printed line
to collections, objects and files. The original examples are preserved alongside
new lessons, practice challenges and automated checks.

## Quick start

Install **JDK 17+**, then check that both `java -version` and `javac -version` work.

```sh
git clone https://github.com/illusionoftalha/basic_java.git
cd basic_java
```

**Windows PowerShell:**

```powershell
./scripts/check.ps1
```

**macOS / Linux / Git Bash:**

```sh
bash scripts/check.sh
```

The script compiles every `.java` file, runs regression checks and executes the
guided demos. It writes only ignored compiler output and disposable file-demo data.
If PowerShell blocks script execution under your machine's policy, use Git Bash
or the manual compile command below rather than changing that policy.

### Compile and run manually

```sh
javac -encoding UTF-8 -d Java/Tutorials/bin Java/Tutorials/src/*.java
java -cp Java/Tutorials/bin HelloWorld
java -cp Java/Tutorials/bin Gradebook 50 75 100
```

The gradebook prints:

```text
50: D
75: B
100: A
Average: 75.00
Highest: 100
```

Run from the repository root. Some shells handle wildcard expansion differently;
the PowerShell check script gathers source filenames explicitly for Windows.

## Choose your next step

| Goal | Guide |
|---|---|
| Follow the course in order | [Learning path](docs/LEARNING_PATH.md) |
| Fix a compiler or runtime mistake | [Common errors](docs/COMMON_ERRORS.md) |
| Practice with clear expected behavior | [Exercise lab](exercises/README.md) |
| Extend the gradebook | [Project source](Java/Tutorials/src/Gradebook.java) |
| Improve the course | [Contribution guide](CONTRIBUTING.md) |

## The learning path

1. **Start:** HelloWorld, values, data types and operators.
2. **Control flow:** conditions, switch statements and loops.
3. **Organize data:** arrays, strings, reference values and maps.
4. **Organize behavior:** methods, exceptions and objects.
5. **Use files:** UTF-8 text and temporary resources.
6. **Build a project:** validate scores and summarize a gradebook.

The [full path](docs/LEARNING_PATH.md) links each source file and gives you a small
change to try. No example needs an account, database or external service.

## Project: gradebook

```sh
java -cp Java/Tutorials/bin Gradebook
java -cp Java/Tutorials/bin Gradebook 72 85 93
```

With no arguments, the project uses a sample dataset. With arguments, it accepts
integer scores from 0 to 100. Invalid input prints an error and exits with status 2.
Try adding a median or CSV input after completing the existing checks.

## Repository map

```text
Java/Tutorials/src/     28 runnable classes, including LearningChecks
Java/Tutorials/bin/     Generated classes (ignored by Git)
docs/LEARNING_PATH.md   Ordered lessons and commands
docs/COMMON_ERRORS.md  Compiler, classpath and language troubleshooting
docs/notes/            Data types, operators and references explained
exercises/             Practice tasks and acceptance examples
scripts/               PowerShell and Bash check commands
```

## Quality checks

`LearningChecks` tests grade boundaries, fractional averages, negative-only
arrays, factorial overflow guards, word counts, invalid ages, book borrowing and
UTF-8 file round trips. It does not depend on Java's optional `-ea` flag.
CI runs JDK 17 and 21 on Ubuntu and Windows. Interactive or graphical tools are
not needed; all examples use the JDK standard library.

## License

© 2026 Sheikh Muhammad Talha Bin Khalid. All Rights Reserved.
