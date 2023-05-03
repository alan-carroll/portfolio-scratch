(ns components.labeled-input-scenes
  (:require [portfolio.html :refer-macros [defscene]]))

(defscene empty-input
  (str "<div class=\"test\"><label>Do you like cheese?</label></div>"))