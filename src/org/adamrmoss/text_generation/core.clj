(ns org.adamrmoss.text-generation.core)

(defn analyze
  ([word config]
    (analyze word config {}))
  ([word config existing-analysis]
    {:analyzed-words #{word},
     :word-length-distribution {(.length word) 1}}))
