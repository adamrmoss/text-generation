(ns adamrmoss.random.core)

(defn choose [collection random]
  "Use a random number generator to choose an element"
  (let [collection-count (count collection)
        random-index (.nextInt random collection-count)]
    (nth collection random-index)))

