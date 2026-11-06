# 100 Days of LeetCode

A small Java repository for practicing LeetCode-style problems. It contains standalone console programs that demonstrate array and string problem-solving techniques; it is a learning collection rather than a packaged application.

## Table of Contents

- [Overview](#overview)
- [Solutions](#solutions)
- [Technology](#technology)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Running a Solution](#running-a-solution)
- [Implementation Notes](#implementation-notes)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Overview

Each Java source file in `src/` is a standalone exercise with a `main` method and sample data embedded in the code. The repository currently focuses on basic array manipulation and string processing. There is no application server, user interface, persistence layer, or external service.

The intended audience is learners who want to read, compile, and run individual Java solutions.

## Solutions

| Source file | Exercise | Current implementation |
| --- | --- | --- |
| `MaxConsecutiveOnes.java` | Find the longest consecutive run of ones in an integer array | Implemented; scans the array and prints the maximum run. |
| `MergeSortedArray.java` | Merge two sorted arrays | Method is currently an empty stub. |
| `MissingNumber.java` | Find a missing number from the sample sequence | Implemented in `main`; computes from the sample array and prints the result. |
| `MoveZeroes.java` | Move zeroes to the end of an array | Implemented in `main`; preserves the order of non-zero values. |
| `RemoveDuplicatesfromSortedArray.java` | Remove duplicates from a sorted array in place | Implemented in `main`; prints the resulting logical length and array contents. |
| `TwoSum.java` | Find two indices whose values add to a target | Implemented as `twoSum`; prints the returned indices for the hard-coded sample. |
| `ValidPalindrome.java` | Check whether a string is a palindrome, ignoring non-alphanumeric characters and case | Implemented as `isPalindrome`; prints the result for the hard-coded sample. |

These programs use hard-coded examples rather than accepting command-line or interactive input.

## Technology

- **Language:** Java
- **Project layout:** Plain Java source files in the default package
- **IDE metadata:** IntelliJ IDEA project/module files are present
- **Dependencies:** No third-party libraries or dependency manager are present
- **Database, APIs, authentication, and environment variables:** Not used by the current project

The repository does not specify a required Java version or provide a build configuration such as Maven or Gradle.

## Project Structure

```text
.
├── .gitignore
├── .idea/                              # IntelliJ IDEA project settings
├── Max Consecutive Ones_LeetCode_485.iml # IntelliJ Java module configuration
└── src/
    ├── MaxConsecutiveOnes.java
    ├── MergeSortedArray.java
    ├── MissingNumber.java
    ├── MoveZeroes.java
    ├── RemoveDuplicatesfromSortedArray.java
    ├── TwoSum.java
    └── ValidPalindrome.java
```

The repository also contains `connectGit.txt`, a short text file unrelated to the Java exercises.

## Getting Started

### Prerequisites

- A Java Development Kit (JDK) that provides `javac` and `java`.
- A terminal, or an IDE capable of compiling Java source files.

The project does not define a minimum JDK version. The examples below use standard `javac` and `java` commands.

### Clone the repository

```bash
git clone https://github.com/dangtrungghieu/100daysLeetcode.git
cd 100daysLeetcode
```

No dependency installation or environment configuration is required.

## Running a Solution

Compile the source files into an output directory:

```bash
mkdir -p out
javac -d out src/*.java
```

Run an individual class by its name. For example:

```bash
java -cp out MaxConsecutiveOnes
```

Other available classes include `TwoSum`, `MissingNumber`, `MoveZeroes`, `RemoveDuplicatesfromSortedArray`, and `ValidPalindrome`. `MergeSortedArray` currently has no runnable solution logic. Edit the hard-coded examples in each source file to try different inputs.

## Implementation Notes

- Solutions are independent classes and can be run separately; there is no shared application entry point.
- Most example input and output are handled directly inside each class's `main` method.
- `TwoSum` and `ValidPalindrome` also expose solution methods that can be called from Java code.
- `MergeSortedArray.merge(...)` is declared but has no implementation yet.
- There is no production build or deployment process defined in the repository.

## Testing

No test framework or test source directory is currently included. Compile all source files with the command above and run a class to execute its embedded sample. The output is printed to standard output.

## Contributing

For changes to this learning collection:

1. Add or update a Java exercise under `src/`.
2. Give the class and source file a descriptive name.
3. Include a small, understandable sample in `main` when appropriate.
4. Compile the sources with `javac -d out src/*.java` and run the changed exercise to check it.
5. Update the solutions table in this README when adding or completing an exercise.

## License

No license is declared in the repository. All rights and permissions should be treated as unspecified unless the repository owner adds a license.
