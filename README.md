# 🎄 Advent of Code 2025

My solutions for [Advent of Code 2025](https://adventofcode.com/2025), written in **Clojure** as a learning adventure!

## Prerequisites

- [Clojure CLI](https://clojure.org/guides/install_clojure) (v1.11+)
- Java 11+ (OpenJDK or similar)

### macOS Installation
```bash
brew install clojure/tools/clojure
```

### Verify Installation
```bash
clj --version
```

## Project Structure

```
.
├── deps.edn           # Project dependencies and aliases
├── src/
│   └── aoc/
│       ├── core.clj   # Shared utilities and runner
│       └── day01.clj  # Day 1 solution (and so on...)
├── inputs/
│   └── day01.txt      # Puzzle inputs (not committed)
└── test/
    └── aoc/           # Tests (optional)
```

## Usage

### Running Solutions

```bash
# Run a specific day
clj -X:run :day 1

# Or using main function
clj -M -m aoc.core 1
```

### REPL-Driven Development (Recommended!)

Clojure shines with interactive REPL development:

```bash
# Start a REPL with dev dependencies
clj -M:dev -m nrepl.cmdline --interactive

# Or just a basic REPL
clj
```

If using VS Code + Calva, Emacs + CIDER, or IntelliJ + Cursive, connect to the REPL from your editor for the best experience.

### Running Tests

```bash
clj -X:test
```

## Puzzle Inputs

Place your puzzle inputs in the `inputs/` directory:
- `inputs/day01.txt`
- `inputs/day02.txt`
- etc.

**Note:** Puzzle inputs are personal and should not be shared publicly (hence gitignored).

## Quick Clojure Reference

```clojure
;; Reading input
(slurp "inputs/day01.txt")           ; Read file as string
(clojure.string/split s #"\n")       ; Split into lines
(map parse-long ["1" "2" "3"])       ; Parse strings to numbers

;; Common operations
(reduce + [1 2 3 4 5])               ; Sum: 15
(filter even? (range 10))            ; (0 2 4 6 8)
(map inc [1 2 3])                    ; (2 3 4)
(into {} [[:a 1] [:b 2]])            ; {:a 1, :b 2}
(frequencies "aabbbc")               ; {\a 2, \b 3, \c 1}

;; Destructuring
(let [[a b & rest] [1 2 3 4 5]]      ; a=1, b=2, rest=(3 4 5)
  ...)

;; Threading macros (very useful!)
(->> input                           ; Thread-last
     (map parse-long)
     (filter pos?)
     (reduce +))

(-> data                             ; Thread-first
    :some-key
    (get 0)
    inc)
```

## Progress

| Day | Part 1 | Part 2 | Notes |
|-----|--------|--------|-------|
| 1   | ⬜     | ⬜     |       |
| 2   | ⬜     | ⬜     |       |
| 3   | ⬜     | ⬜     |       |
| ... | ...    | ...    |       |

Legend: ⭐ Solved | ⬜ Not started | 🔄 In progress

## Resources

- [Clojure Documentation](https://clojure.org/reference/documentation)
- [ClojureDocs](https://clojuredocs.org/) - Community examples
- [Clojure Cheatsheet](https://clojure.org/api/cheatsheet)
- [4Clojure](https://4clojure.oxal.org/) - Practice problems
- [Advent of Code](https://adventofcode.com/2025)

Happy coding! 🎅

