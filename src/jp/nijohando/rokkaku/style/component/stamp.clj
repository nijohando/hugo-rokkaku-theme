(ns jp.nijohando.rokkaku.style.component.stamp
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px percent)]
            [garden.selectors :refer (li first-child nth-child last-child)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn component
  [suffix size font-size1 font-size2 border-size padding-size color]
  (let [style-name (str ".c-stamp-" suffix)
        bar-width size
        width size
        height size]
    [[(keyword style-name)
      {
       :border (str border-size "px solid " color)
       :border-radius (percent 50)
       :box-sizing "border-box"
       :width (px width)
       :height (px height)
       :color color
       :display "inline-block"
       :line-height (px font-size2)}
      [:ul
       {:display "flex"
        :flex-direction "column"
        :align-items "center"
        :list-style-type "none"
        :justify-content "center"
        :transform "rotate(-30deg)"
        :width (percent 100)
        :height (percent 100)}]
      [:li
       {:font-size (px font-size1)
       :box-sizing "border-box"}]
      [(li (first-child))
       {:padding-bottom (px padding-size)}]
      [(li (nth-child 2))
       {:border-top (str border-size "px solid" color)
        :border-bottom (str border-size "px solid" color)
        :padding-top (px padding-size)
        :padding-bottom (px padding-size)
        :padding-left (px 3)
        :padding-right (px 3)
        :font-size (px font-size2)}]
      [(li (last-child))
       {:padding-top (px (* 2 padding-size))}]]]))

