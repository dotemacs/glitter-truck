(ns glitter-truck.core-test
  (:require [clojure.test :refer :all]
            [glitter-truck.core :refer :all]
            [sparkledriver.core :refer [fetch! make-browser status-code]]))

(deftest simplest-test
  (testing "status code"
    (is (= 200
           (-> (make-browser)
               (fetch! "http://clojure.org")
               status-code))))
  (testing "matching line"
    (is (= "I hope you find Clojure's combination of facilities elegant, powerful, practical and fun to use."
           (foo)))))
