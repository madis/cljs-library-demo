(ns test-lib.core-test
  (:require [test-lib.core :as tlc]
            ; [clojure.test :refer [is testing]]
            [cljs.test :refer-macros [deftest is testing]]))

(deftest things-that-should-be
  (testing "simple calculation"
    (is (= 1764 (tlc/calculate 42))))

  (testing "transitive Node.js dependency"
    (is (= (js->clj (tlc/answer-from-library "The question") :keywordize-keys true)
           {:input "The question" :answer 42}))))
