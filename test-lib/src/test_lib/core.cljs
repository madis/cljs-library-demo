(ns test-lib.core
  (:require ["test_trans_dep" :as ttd]))

(defn calculate [x] (* x x))

(defn answer-from-library [input]
  (ttd/getTheAnswer input))
