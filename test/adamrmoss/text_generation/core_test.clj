(ns adamrmoss.text-generation.core-test
  (:use clojure.test
        adamrmoss.text-generation.core))

(deftest analyze-banana
  (testing "Analyzing just the single word \"banana\""
    (let [analysis (analyze "banana")]
      (is (= ["banana"]
             (:analyzed-words analysis))))))

