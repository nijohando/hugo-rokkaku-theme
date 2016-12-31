(ns jp.nijohando.rokkaku.style.project.article
  (:refer-clojure :exclude [rem > not * +])
  (:require [garden.units :refer [px]]
            [garden.units :refer (px rem em percent)]
            [garden.selectors :refer (& a hover attr attr= code > li not first-of-type first-child last-child before after) :as s]
            [garden.arithmetic :refer (* +)]
            [garden.stylesheet :refer (at-import at-media at-keyframes)]
            [clojure.string :as string]
            [jp.nijohando.rokkaku.style.foundation.base :as base]
            ))

(defn project
  []
  [[:.p-article
    {:padding-bottom (rem 2)}]
   [:.c-stamp-large
    {:position "absolute"
     :opacity 0.1
     :right (px -20)
     :top (px -20)
     :z-index 10}]
   [:.p-article__title
    {:display "flex"
     :align-items "center"}]
   [:.p-article__title__text
    {:color base/color-link-fg
     :font-size base/xx-large
     :line-height (em 1.5)
     :margin-left (rem 1)
     :width (percent 100)}]
   [:.p-article__title__draft
    {:color base/color-fg}]
   [:.p-article__content
    {:margin-top base/xx-large
     :line-height (em 1.7)
     :font-size base/medium}
    [:h1
     {:font-size base/xx-large
      :margin-top (* base/xx-large 2)
      :line-height (em 1.5)
      :padding-bottom (rem 0.2)
      :margin-bottom base/small}
     [(& first-of-type)
      {:margin-top base/xx-large}]]
    [:h2
     {:font-size base/large
      :margin-top (* base/xx-large 1.25)
      :margin-bottom base/small}]
    [(s/+ :h1 :h2)
     {:margin-top (* base/large 1)}]
    [(code (not :.hljs))
     {:color base/color-code-fg
      :background-color base/color-code-bg
      :padding "0.2rem 0.4rem"}]
    [:p
     {:margin-top base/x-small
      :margin-bottom base/x-small}]
    [:ul
     {:margin-top base/medium
      :margin-left (* base/small 2)
      :margin-bottom base/medium}]
    [:ol
     {:margin-top base/medium
      :margin-left (* base/small 2)
      :margin-bottom base/medium}]
    [:blockquote
     {
      :color base/color-quote
      :border-left (str "4px solid " base/color-quote)
      :padding-left (rem 1)
      :padding-top (rem 1.5)
      :padding-bottom (rem 1.5)
      :position "relative"
      :quotes "'“' '”'"}
     [:&:before :&:after
      {:position "absolute"
       :font-size (rem 2)}]
     [:&:before
      {:content "open-quote"
       :top (px 10)
       :left (px -5)}]
     [:&:after
      {:content "close-quote"
       :bottom (px -10)
       :right 0}]
     [:p {:margin-top 0
          :margin-bottom 0}]]
    [:strong
     {:background-image "linear-gradient(transparent 30%, #efcde3 10%)"}]
    [:em
     {:background "#fcd575"
      :font-style "normal"
      :padding-left (em 0.5)
      :padding-right (em 0.5)
      :color "#555555"
      :border-left "3px solid #c89932"
      :border-right "3px solid #c89932"}]
    [:dl
     {:margin-top base/medium
      :margin-left base/medium}
     [:dt
      {:font-weight "bold"
       :padding-left base/xx-small
       :border-left "4px solid #999999"
       :background-color "#eeeeee"}]
     [:dd
      {:margin-left base/xx-large
       :margin-top base/xx-small
       :margin-bottom base/medium
       :font-size base/small}
      [:code
       {:font-size base/medium}]]]]])

