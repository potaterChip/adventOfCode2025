# Advent of Code 2025

My solutions for [Advent of Code 2025](https://adventofcode.com/2025), written in **Clojure** as an added challenge since I don't know anything about Clojure really.

## AI Note

I'm using AI to help define the Clojure project. If I didn't, I'd probably never finish (I'll still probably not finish).
In fact, you can probably tell there's a bunch of AI slop all over this README. I might clean it up later, but also I probably won't.

I will not be using AI to solve any of the puzzles. I will be using AI to help with Clojure specific functions. For example, helping me write a function that
reads a file. Giving me hints on how to properly format string values. etc.

In this README itself, extra Clojure info will be prefaced with an 'Eric noob clojure note', and will contain probably a lot of info regular Clojure users would laugh at (could possibly be completely wrong too) Like below

#### Eric noob clojure note

The deps.edn is a Clojure standard. EDN (Extensible Data Notation) is built with Clojure itself. Clojure all the way down. `clj` specifically looks for the deps.edn file. Other edn files are just data files not auto picked up

## Prerequisites

- [Clojure CLI](https://clojure.org/guides/install_clojure) (v1.11+)
- Java 11+ (OpenJDK or similar)

### macOS Installation

```bash
brew install clojure/tools/clojure
```

### Windows Installation

lol

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
│   └── day01.txt      # Puzzle inputs
└── test/
    └── aoc/           # Tests
```

## Usage

### Running Solutions

```bash
# Run a specific day
clj -X:run :day 1

# Or using main function
clj -M -m aoc.core 1
```

#### Eric noob clojure note

-X means execute a function. What comes after the colon is the name of the function, or in this case a function alias. You can see that 'run' is defined in the deps.edn file. You can still run a function directly if you want:

```bash
clj -X aoc.core/run-day :day 1
```

-M is just 'main' or 'classpath' mode. If you look at the 'dev' alias, that's not a function (doesn't use the :exec-fn keyword ["keyword" is essentially anything in Clojure begining with a ':'] so you wouldn't use -X)

However, even if you don't specify anything extra after -M, apparently you still need to specify it. Then you add the extra -m, which is actually pointing to the namespace/file that contains your main function.

### REPL-Driven Development (Recommended!)

Clojure shines with interactive REPL development:

```bash
# Start a REPL with dev dependencies
clj -M:dev -m nrepl.cmdline --interactive

# Or just a basic REPL
clj
```

If using VS Code + Calva, Emacs + CIDER, or IntelliJ + Cursive, connect to the REPL from your editor for the best experience.

##### Eric noon clojure note

The actual dev alias is

```
{:dev {:extra-deps {nrepl/nrepl {:mvn/version "1.3.0"}
                     cider/cider-nrepl {:mvn/version "0.50.2"}}}
```

So you're just using -M here to add some extra dependencies, and then -m is specifying a main class in the nrepl space.

Also, I love VS Code, so I'm using the Calva extension
