(ns glitter-truck.core
  (:require [sparkledriver.core :refer [with-browser make-browser fetch! find-by-xpath* text status-code]]))

(defn foo
  []
  (with-browser [browser (make-browser)]
    (-> (fetch! browser "http://clojure.org")
        (find-by-xpath* "//div[@class='clj-intro-message']/p")
        (nth 2)
        text)))
