(ns javafx-clj.application
  (:gen-class
   :name javafx.clojure.FXApplication
   :extends javafx.application.Application
   :methods [#^{:static true} [getCurrentStage [] javafx.stage.Stage]
             #^{:static true} [isStopped [] Boolean]]
   :exposes-methods {stop parentStop}))

(def current-stage (atom nil))
(def stopped (atom false))

(defn -getCurrentStage
  []
  @current-stage)

(defn -isStopped
  []
  @stopped)

(defn -start [this stage]
  (reset! current-stage stage))


(defn -stop [this]
  (.parentStop this)
  (reset! stopped true))