(ns portfolio
  (:require [portfolio.ui :as ui]
            [components.labeled-input-scenes]))

(ui/start!
 {:config
  {:css-paths ["/assets/css/style.css"]}})

(defn init [])