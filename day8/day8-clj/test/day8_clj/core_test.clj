(ns day8-clj.core-test
  (:require [clojure.test :refer :all]
            [day8-clj.core :refer :all]))

(deftest a-test
  (testing "combining layers"
    (let [input (partition-all 4 (map #(Integer/parseInt %) (clojure.string/split "0222112222120000" #"")))]
      (is (= '(0 1 1 0) (reduce combine-layers input))))))
