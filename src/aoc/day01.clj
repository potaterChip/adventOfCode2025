(ns aoc.day01
  "Day 1: [Title will be revealed when puzzle unlocks]"
  (:require [aoc.core :as aoc]
            [clojure.string :as str]))

;; Puzzle input
(def input (delay (aoc/read-input-lines 1)))

(defn parse-input
  "Parse the input for day 1"
  [lines]
  ;; TODO: Implement parsing based on puzzle format
  lines)

(defn part1
  "Solve part 1"
  []
  (let [data (parse-input @input)]
    ;; TODO: Implement solution
    "Not yet implemented"))

(defn part2
  "Solve part 2"
  []
  (let [data (parse-input @input)]
    ;; TODO: Implement solution
    "Not yet implemented"))

(comment
  ;; REPL-driven development playground
  ;; Evaluate these forms interactively as you solve the puzzle
  
  ;; Load sample input for testing
  (def sample-input
    "paste
sample
input
here")
  
  (def sample-lines (str/split sample-input #"\n"))
  
  ;; Test your parsing
  (parse-input sample-lines)
  
  ;; Test part 1
  (part1)
  
  ;; Test part 2  
  (part2)
  
  ;; End of REPL playground
  )

