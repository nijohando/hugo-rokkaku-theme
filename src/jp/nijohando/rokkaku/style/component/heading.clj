(ns jp.nijohando.rokkaku.style.component.heading
  (:refer-clojure :exclude [rem > not * +])
  (:require [garden.units :refer (px rem em percent)]
            [garden.arithmetic :refer (* +)]
            [garden.selectors :refer (& not first-child)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn component
  []
  [
   [:.c-heading
    {:color base/color-fg
     :position "relative"
     :width (percent 100)}
    [:.c-stamp-small
     {:position "absolute"
      :left (px -75)
      :top (px 55)
      :z-index 0}]]
   [:.c-heading__title
    {:display "flex"
     :align-items "center"
     :position "relative"
     :font-size base/small
     :margin-top (rem 1)
     :margin-bottom base/xx-small}]
   [:.c-heading__title__icon
    {:position "absolute"
     :z-index 10
     :left (px -3)}]
   [:.c-heading__title__text
    {:font-size base/x-large
     :margin-left (px 30)
     :line-height (em 1.5)
     :z-index 1}]
   [:.c-heading__summary
    {:margin-bottom (* base/medium 2)
     :margin-left (rem 1)
     :line-height (em 1.5)
     :font-size base/small}]
   [:.c-heading__tags
    {:list-style-type "none"
     :display "flex"
     :flex-direction "row"
     :align-items "center"
     :justify-content "flex-end"
     :flex-wrap "wrap"
     :margin-left (rem 0.5)}]
   [:.c-heading__tags__tag
    {:font-family base/font-sans-serif
     :font-size base/small}
    [:a {:color base/color-fg
         :font-family base/font-sans-serif}]
    [(& first-child)
     {:padding "0 10px 0 0"}]
    [(& (not first-child))
     {:padding "0 10px 0 10px"
      :border-left (str "2px solid " base/color-fg)}]]])
