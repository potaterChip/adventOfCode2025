(ns aoc.day01
  "Day 1"
  (:require [aoc.core :as aoc]
            [clojure.string :as str]))

(def input (delay (aoc/read-input-lines 1)))

(defn parse-line
  "Take input like L68 or R1 and return the letter and number separately"
  [line]
  (let [letter (first line)
        number (parse-long (subs line 1))]
    [letter number]))

(defn process-rotation
  "Determine the direction and add/subtract from the current value"
  [[direction num-of-clicks] current-position]
  (case direction
    \L (- current-position num-of-clicks)
    \R (+ current-position num-of-clicks)))

(defn evaluate-current-value
  "If the resulting value from a process rotation is less than zero, subtract that absolute value from 100. If it's equal to or greater than 100, subtract 100 from the value. A value of 0 to 99 can be left as is.",
  [processed-rotation]
  (mod processed-rotation 100))


(defn count-zeros-touched [position delta]
  "Count how many times we touch dial position 0 during movement"
  (cond
    (pos? delta) (quot (+ position delta) 100)
    (neg? delta) (- (Math/floorDiv (long (dec position)) 100)
                    (Math/floorDiv (long (+ position delta -1)) 100))
    :else 0))

(defn part1
  "Solve part 1"
  []
  (let [data @input
        initial-state {:position 50 :zero-count 0}
        process-line (fn [{:keys [position zero-count]} line]
                       (let [[direction clicks] (parse-line line)
                             rotated (process-rotation [direction clicks] position)
                             new-position (evaluate-current-value rotated)]
                         {:position new-position
                          :zero-count (if (= new-position 0)
                                        (inc zero-count)
                                        zero-count)}))]
    (:zero-count (reduce process-line initial-state data))))
;; as it stands, the answer is 1118

(defn part2
  []
  (let [data @input
        initial-state {:position 50 :zero-count 0}
        process-line (fn [{:keys [position zero-count]} line]
                       (let [[direction clicks] (parse-line line)
                             delta (if (= direction \R) clicks (- clicks))
                             zeros (count-zeros-touched position delta)
                             new-position (mod (+ position delta) 100)]
                         {:position new-position
                          :zero-count (+ zero-count zeros)}))]
    (:zero-count (reduce process-line initial-state data))))


