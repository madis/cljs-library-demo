(ns test-app.core
  (:require [test-lib.core :as tlc]))

(println "Hello world!")

(defn -main []
  (println "The answer is: " (tlc/calculate 42))
  (println ">>>>> " (tlc/calculate-local 111))
  (println "Second thing: " (tlc/answer-from-library "The Q")))
