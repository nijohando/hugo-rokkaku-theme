(ns jp.nijohando.rokkaku.style.component.heading
  (:refer-clojure :exclude [rem > not * +])
  (:require [garden.units :refer (px rem em percent)]
            [garden.arithmetic :refer (* +)]
            [garden.selectors :refer (& not first-child)]
            [garden.stylesheet :refer (at-media)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn component
  []
  [
   [:.c-heading
    {:color base/color-fg
     :position "relative"
     :border-left (str "2px solid " base/color-fg)
     :width (percent 100)}
    [:.c-stamp-small
     {:position "absolute"
      :left (px -55)
      :top (px 80)
      :opacity "0.8"
      :z-index 10}]]
   [:.c-heading__title
    {:display "flex"
     :align-items "center"
     :position "relative"
     :font-size base/small
     :margin-top (rem 1)
     :margin-bottom base/xx-small}]
   [:.c-heading__title__icon
    {:position "absolute"
     :width (px 14)
     :height (px 14)
     :background-color base/color-fg
     :border-radius (percent 50)
     :z-index 10
     :left (px -8)
     :top (px 53)}]
   [:.c-heading__title__text
    {:font-size base/xx-large
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
      :border-left (str "2px solid " base/color-fg)}]]
   [(at-media {:max-width (px 599)}
              [:.c-heading
               [:.c-stamp-small
               {:left (px -55)
                :top (px 68)}]]
              [:.c-heading__title__icon
               {:top (px 43)
                :left (px -6)
                :height (px 10)
                :width (px 10) }]
              [:.c-heading__title__text
               {:font-size (rem 1.1)}]
              [:.c-heading__summary
               {:margin-left (rem 0.7)}])]])
