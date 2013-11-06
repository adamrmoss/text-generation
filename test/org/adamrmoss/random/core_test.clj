(ns org.adamrmoss.random.core-test
  (:use clojure.test
        org.adamrmoss.random.core))

(deftest choices-from-collection
  (let [sample-vector [1, 2, 3, 4, 5]
        random (java.util.Random. 4298)]
    (testing "Making random choices from [1, 2, 3, 4, 5]"
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

(deftest choices-from-distribution
  (let [sample-map {1 1, 2 5, 3 1}
        random (java.util.Random. 8711)]
    (testing "Making random choices using the distribution {1 1, 2 5, 3 1}"
      (is (= 2 (choose sample-map random)))
      (is (= 1 (choose sample-map random)))
      (is (= 2 (choose sample-map random)))
      (is (= 2 (choose sample-map random)))
      (is (= 1 (choose sample-map random)))
      (is (= 3 (choose sample-map random)))
      (is (= 1 (choose sample-map random)))
      (is (= 2 (choose sample-map random)))
      (is (= 2 (choose sample-map random)))
      (is (= 2 (choose sample-map random)))
      (is (= 2 (choose sample-map random))))))

