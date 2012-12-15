(ns javafx-clj.application
  (:gen-class
   :name javafx.clojure.FXApplication
   :extends javafx.application.Application
   :methods [#^{:static true} [getCurrentStage [] javafx.stage.Stage]]))

(def current-stage (atom nil))

(defn -getCurrentStage
  []
  @current-stage)

(defn -start [this stage]
  (reset! current-stage stage))

