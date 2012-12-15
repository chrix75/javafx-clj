(ns javafx-clj.core-test
  (:use clojure.test
        javafx-clj.wrapper)
  (:import javafx.scene.control.Button java.lang.Thread))

(deftest show-window-with-button
  (launch :width 500 :height 500)

  (with-javafx
  (let [btn (Button.)]
    (.setLayoutX btn 100)
    (.setLayoutY btn 150)
    (.setText btn "Hello World!")
    (add-child @javafx-clj.wrapper/primary-root btn)))

  (show)
  (while (not (stopped?))
    (Thread/sleep 1000)))