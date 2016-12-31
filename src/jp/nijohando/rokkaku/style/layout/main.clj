(ns jp.nijohando.rokkaku.style.layout.main
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem percent)]
            [garden.stylesheet :refer (at-media)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn layout
  []
  [[:main
    {:padding-top (rem 2)
     :background-color base/color-bg}]])
