(ns javafx-clj.core-test
  (:use clojure.test)
  (:require [javafx-clj.wrapper :as jfx])
  (:import javafx.scene.control.Button java.lang.Thread))

(deftest show-window-with-button
  (jfx/launch :width 500 :height 500)

  (jfx/with-javafx
    (let [btn (Button.)]
      (doto btn
        (.setLayoutX 100)
        (.setLayoutY 150)
        (.setText "Hello World!"))
      
      (jfx/add-child @javafx-clj.wrapper/primary-root btn))
    (jfx/show))

  (jfx/wait-stopping))