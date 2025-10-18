## Purpose
Short, focused guidance to help an AI coding agent be productive in this repository of Java classroom exercises.

## Big picture
- This repo is a collection of small, standalone Java exercises (one per folder). Each exercise is implemented with a single `Main` class (no packages) and an optional `Input` helper. Example: `Java-11-CW/Main.java` and `Java-11-CW/Input.java`.
- Typical flow: `Main` contains an `init()` method (called from `public static void main`) and a few small helper methods to implement. The grading/runner expects `Main` to remain the public entry point.

## Important files & examples
- Exercise entry points: any `Main.java` under top-level folders (e.g., `Java-11-CW/Main.java`, `Java-8-Activity/Main.java`).
- Input helper: some exercises include an `Input.java` with static helpers like `readInt()`, `readString()`, and `readFile(String fn)`. See `Java-11-CW/Input.java` for the canonical implementation.
- Repo README is minimal (`README.md`, `Java-main/Java-main/README.md`) — treat folders as self-contained exercises.

## Project-specific conventions
- Keep code in the default package. Do NOT add `package` declarations — the exercises are compiled and run directly.
- Keep the public class named `Main` and do not rename the file. The launcher pattern is `public static void main(String[] args) { (new Main()).init(); }`.
- Implement only the small function stubs inside `Main` (they are usually accompanied by a comment like "Problem 1"). Avoid changing the surrounding I/O scaffolding or helper methods (`print`, `printt`, `init` invocation).
- If `Input.java` is present, use its static methods for consistent behavior. `Input.readFile(fn)` reads a file relative to the repo root (uses `Files.readAllBytes(Paths.get(fn))`).

## How to compile & run (examples)
- Compile an exercise (from repo root or the exercise folder):
  - cd into exercise folder, then:
    - javac *.java
    - java Main
  - If the exercise reads stdin, you can pass a file: `java Main < input.txt`.
  - If the exercise calls `Input.readFile("data.txt")`, ensure the file exists at the relative path supplied.

## Behavior patterns to preserve
- Printing helpers: many `Main` classes define `void print(Object o)` and `void printt(Object o)`. Prefer using them when modifying code in the same file.
- String-manipulation style: exercises implement small, deterministic transformations (examples in `Java-11-CW/Main.java`: `getUsername`, `splitReverse`, `createUsername`). Use `String` API (`indexOf`, `substring`, `charAt`, `length`, `split`) rather than external libraries.

## Safety and boundaries for automated edits
- Do not change file/folder names or add packages — this will break expected compile/run commands.
- Avoid modifying `Input.java` unless fixing a clear bug; prefer implementing logic inside `Main`.
- Keep changes local to the exercise folder unless instructed; exercises are intentionally isolated.

## Small examples (how to implement)
- To extract a username from an email (reference `Java-11-CW/Main.java`): split on `'@'` and return the left part.
- To run quick manual verification: `cd Java-11-CW`, `javac *.java`, `java Main` (or `java Main < sample_input.txt`).

## When in doubt
- Prefer minimal edits that satisfy the function's contract visible in comments.
- If a requested feature needs cross-exercise changes or new dependencies, ask for clarification.

If you'd like, I can refine this with examples of implemented solutions for one exercise or expand to include a small test harness.
