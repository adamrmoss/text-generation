(ns org.adamrmoss.text-generation.core-test
  (:use clojure.test
        org.adamrmoss.text-generation.core))

(deftest analyze-banana
  (testing "Analyzing just the single word \"banana\""
    (let [analysis (analyze "banana" {})]
      (is (= #{"banana"}
             (:analyzed-words analysis)))
      (is (= {6 1}
             (:word-length-distribution analysis)))
      (is (= {"ba"   {"na" 1, "nan" 1, "nana" 1},
              "an"   {"an" 1, "ana" 1},
              "na"   {"na" 1},
              "ban"  {"an" 1, "ana" 1},
              "ana"  {"na" 1},
              "bana" {"na" 1}}
             (:subword-followings analysis))))))

