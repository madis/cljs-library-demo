(ns test-lib.core-test
  (:require [test-lib.core :as tlc]
            ; [clojure.test :refer [is testing]]
            [cljs.test :refer-macros [deftest is testing]]))

(deftest things-that-should-be
  (testing "simple calculation"
    (is (= 1764 (tlc/calculate 42)))))
