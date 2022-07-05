(ns test-lib.core
  (:require
    ["test_trans_dep" :as ttd]))

(defn calculate [x] (* x x))

(defn calculate-local [x] "local pero muy local xxx")

(defn answer-from-library [input]
  (ttd/getTheAnswer input))
