(ns jp.nijohando.rokkaku.style.layout.footer
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (rem)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn layout
  []
  [:footer#footer
   {:color base/color-bg
    :font-size (rem 0.8)}])
