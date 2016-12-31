(ns jp.nijohando.rokkaku.style.layout.pane
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem percent)]
            [garden.stylesheet :refer (at-media)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn layout
  []
  [[:.pane {}]
   [:.pane__main
    {:position "relative"}]
   [:.pane__main--splited
    {:width "calc(100% - 300px)"
     :overflow-x "hidden"
     :position "relative"}]
   [:.pane__side
    {:border-top  (str  "6px solid " base/color-fg)
     :position "fixed"
     :top (px 0)
     :right (px 0)
     :background-color base/color-sub-pane
     :height (percent 100)
     :width (px 300)
     :z-index 10
     :overflow-y "scroll"}]
   [:.pane__side__content
    {
     :line-height base/xx-large
     :padding (rem 1)}]
   [:.pane__side__content__title
    {:text-align "center"}]
   [:#TableOfContents
    {:font-size base/small}
    [:ul
     [:ul {:font-size base/small
           :margin-left base/x-small}]]]

   [(at-media {:min-width (px 1000)
               :max-width (px 1999)}
              [:.pane__main :.pane__main--splited
               [:main :#header {:padding-left (rem 5)
                       :padding-right (rem 5)}]]
              [:.pane__main--splited
               [:main {:padding-right (rem 3)}]])]

   [(at-media {:min-width (px 800)
               :max-width (px 999)}
              [:.pane__main :.pane__main--splited
               [:main :#header
                {:padding-left (rem 3)
                 :padding-right (rem 3)}]]
              [:.pane__main--splited
               [:main {:padding-right (rem 2)}]])]

   [(at-media {:min-width (px 600)
               :max-width (px 799)}
              [:.pane__main--splited
               {:width (percent 100)}]
              [:.pane__main :.pane__main--splited
               [:main :#header
                {:padding-left (rem 3)
                 :padding-right (rem 3)}]]
              [:.pane__side
               {:display "none"}])]

   [(at-media {:max-width (px 599)}
              [:.pane__main :.pane__main--splited
               [:main :#header {
                       :padding-left (rem 2)
                       :padding-right (rem 2)}]])]

   [(at-media {:max-width (px 799)}
              [:.pane__main--splited
               {:width (percent 100)}]
              [:.pane__side
               {:display "none"}])]
   ])

