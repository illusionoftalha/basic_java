#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
mkdir -p Java/Tutorials/bin
javac -encoding UTF-8 -d Java/Tutorials/bin Java/Tutorials/src/*.java
for lesson in LearningChecks HelloWorld JavaDataTypes JavaOperators ReferenceTypes Loops Arrays Methods Collections Exceptions ClassesAndObjects FileIO Gradebook; do
  printf '\n--- %s ---\n' "$lesson"
  java -cp Java/Tutorials/bin "$lesson"
done
printf '\nAll checks and demos passed.\n'
