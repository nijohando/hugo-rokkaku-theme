(ns jp.nijohando.rokkaku.style.layout.header
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem em percent)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn layout
  []
  [:header#header
   {:border-top (str "6px solid " base/color-fg)
    :background-color base/color-bg
    :padding-top (rem 2.5)}
   [:.p-signboard {}]])

