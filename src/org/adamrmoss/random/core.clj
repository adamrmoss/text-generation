(ns org.adamrmoss.random.core)

(defn distribution-entry-to-choice-vector [choice]
  (repeat (val choice) (key choice)))

(defn distribution-to-choice-vector [choices]
  (mapcat distribution-entry-to-choice-vector choices))

(defn choose [choices random]
  "Use a random number generator to choose an element"
  (cond
    (map? choices) (choose (distribution-to-choice-vector choices) random)
    (coll? choices) (let [choices-count (count choices)
                          random-index (.nextInt random choices-count)]
                      (nth choices random-index))))
