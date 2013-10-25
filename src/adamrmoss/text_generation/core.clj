(ns adamrmoss.text-generation.core)

(defn analyze
  ([word]
    (analyze word {}))
  ([word existing-analysis]
    {:analyzed-words #{word},
     :word-length-distribution {(.length word) 1}}))
