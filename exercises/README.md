# Java practice lab

Write your solution on a separate branch. Give it a main method for a demo and
add meaningful checks to `LearningChecks` before considering it complete.

| Level | Challenge | Acceptance examples |
|---|---|---|
| Start | Temperature converter | 0 C -> 32 F; 100 C -> 212 F; -40 C -> -40 F. |
| Start | FizzBuzz | Numbers 1–15; Fizz for multiples of 3, Buzz for 5, FizzBuzz for both. |
| Start | Reverse an array | `[1,2,3]` -> `[3,2,1]`; handle empty and one-item arrays. |
| Start | Character counter | Count a character in a string. Decide whether matching ignores case. |
| Next | Word frequencies | Extend `Collections` to ignore punctuation, and explain your definition of a word. |
| Next | Library shelf | Track multiple `Book` objects; reject borrowing an unavailable title. |
| Project | Gradebook median | Handle both odd and even score counts; do not change the caller's input array. |
| Project | Gradebook CSV | Read `name,score` rows; report invalid rows without silently dropping them. Use UTF-8. |

## Check your understanding

- Why does maximum search start with the first value rather than zero?
- Why does `Gradebook.average` convert before dividing?
- What happens if factorial is allowed to exceed a long's range?
- Why do the file demos use temporary directories?
- Which part of a Book's state can a caller change directly, and why?

Run `./scripts/check.ps1` on Windows or `bash scripts/check.sh` on macOS/Linux
after every change. Keep compiled output out of Git.
