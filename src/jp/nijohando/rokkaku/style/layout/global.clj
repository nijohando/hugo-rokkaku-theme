(ns jp.nijohando.rokkaku.style.layout.global
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem em)]
            [garden.selectors :refer (a hover)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn layout
  []
  [[:html {:font-size (px 17)}]
   [:body
    {:font-family base/font-default
     :background base/color-fg
     :color base/color-fg}]
   [:a
    {:color base/color-link-fg
     :transition "all 0.2s ease"
     :text-decoration "none"}]
   [(a hover)
    {:text-decoration "underline"
     :background "rgb(242,239,230)"}]
   [:hr
    {:border "none"
     :margin-top (rem 3)
     :font-family base/font-hr
     :font-size (rem 2)
     :color base/color-fg-sub
     :text-align "center"
     :margin-bottom (rem 3)
     :overflow "visible"}]
   [:hr:before
    {:content "\"* * *\"" }]])

