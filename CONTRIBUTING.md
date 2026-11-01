# Contributing

Keep each lesson focused on one concept and runnable with JDK 17+ and no external
dependencies. The examples use the default package deliberately to keep the
compile/run steps visible to new learners; package organization can be a later lesson.

1. Create a topic branch.
2. Add or improve a `.java` example with a matching public class name.
3. Add its run command and a practice task to the learning path.
4. Add regression checks for meaningful cases such as empty input, bounds and state changes.
5. Run `./scripts/check.ps1` or `bash scripts/check.sh`.
6. Open a focused PR describing the learner problem and exact validation results.

File examples must use temporary directories and must not overwrite personal
files. Do not add compiled classes, credentials or downloaded dependencies.
Preserve the existing ownership and license notice; a public repository does not
automatically grant an open-source license.
