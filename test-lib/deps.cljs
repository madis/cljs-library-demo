{:paths ["src" "test"]
 :mvn/repos {"central" {:url "https://repo1.maven.org/maven2/"}
             "clojars" {:url "https://clojars.org/repo"}}

 :deps {
        ; org.clojure/clojure       {:mvn/version "1.11.1"}
        ; thheller/shadow-cljs {:mvn/version "2.17.8"}
        org.clojure/clojure {:mvn/version "1.10.3"}
        org.clojure/clojurescript {:mvn/version "1.11.4"
        thheller/shadow-cljs {:mvn/version "2.8.40"}
        }
 :npm-deps {"test_trans_dep" "0.0.1"}
 :install-deps true
 :aliases {:build {:deps {io.github.clojure/tools.build {:tag "v0.8.1" :sha "7d40500"}
                          slipset/deps-deploy {:mvn/version "RELEASE"}}
                   :ns-default build}
           :deploy {:replace-deps {slipset/deps-deploy {:mvn/version "RELEASE"}}
                    :exec-fn deps-deploy.deps-deploy/deploy
                    :exec-args {:installer :remote :artifact "target/test-lib-0.0.1.jar"}}}}