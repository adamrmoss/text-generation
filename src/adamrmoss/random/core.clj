(ns adamrmoss.random.core)

(defn choose [choices random]
  "Use a random number generator to choose an element"
  (cond
    (map? choices) (let [distribution-entry-to-choice-array #(repeat (val %1) (key %1))
                         expanded-array (mapcat distribution-entry-to-choice-array choices)]
                     (choose expanded-array random))
    (coll? choices) (let [choices-count (count choices)
                          random-index (.nextInt random choices-count)]
                      (nth choices random-index))))
