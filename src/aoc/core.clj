(ns aoc.core
  "Advent of Code 2025 - Main entry point"
  (:require [clojure.string :as str]))

(defn read-input
  "Read input file for a given day. Returns the contents as a string."
  [day]
  (slurp (format "inputs/day%02d.txt" day)))

(defn read-input-lines
  "Read input file for a given day. Returns a vector of lines."
  [day]
  (-> (read-input day)
      str/trim
      (str/split #"\n")))

(defn run-day
  "Run solutions for a specific day.
   Usage: clj -X:run :day 1"
  [{:keys [day]}]
  (let [ns-sym (symbol (format "aoc.day%02d" day))]
    (require ns-sym)
    (let [solve-part1 (ns-resolve ns-sym 'part1)
          solve-part2 (ns-resolve ns-sym 'part2)]
      (println (format "=== Day %d ===" day))
      (when solve-part1
        (println "Part 1:" (solve-part1)))
      (when solve-part2
        (println "Part 2:" (solve-part2))))))

(defn -main
  "Main entry point - runs all implemented days"
  [& args]
  (println "🎄 Advent of Code 2025 🎄")
  (println "========================")
  (if-let [day (some-> args first parse-long)]
    (run-day {:day day})
    (println "Usage: clj -M -m aoc.core <day>")))

