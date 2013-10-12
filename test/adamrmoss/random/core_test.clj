(ns adamrmoss.random.core-test
  (:use clojure.test
        adamrmoss.random.core))

(def seed1 4298)
(def seed2 8711)
(def sample-vector [1, 2, 3, 4, 5])

(defn random1 []
  (java.util.Random. seed1))

(defn random2 []
  (java.util.Random. seed2))

(deftest random1-choices
  (let [random (random1)]
    (testing "Experimenting with some choices from [1, 2, 3, 4, 5]"
      (is (= 3 (choose sample-vector random)))
      (is (= 2 (choose sample-vector random)))
      (is (= 5 (choose sample-vector random)))
      (is (= 2 (choose sample-vector random)))
      (is (= 2 (choose sample-vector random)))
      (is (= 1 (choose sample-vector random)))
      (is (= 2 (choose sample-vector random)))
      (is (= 4 (choose sample-vector random)))
      (is (= 5 (choose sample-vector random)))
      (is (= 1 (choose sample-vector random)))
      (is (= 2 (choose sample-vector random))))))
