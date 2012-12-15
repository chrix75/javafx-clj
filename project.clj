(defproject javafx-clj "0.1.0-SNAPSHOT"
  :description "A Clojure wrapper for JavaFX 2.x"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [local.oracle/javafxrt "2.2.3"]]
  :aot [javafx-clj.application]
  )
