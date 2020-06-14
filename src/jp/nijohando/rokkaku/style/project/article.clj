(ns jp.nijohando.rokkaku.style.project.article
  (:refer-clojure :exclude [rem > not * +])
  (:require [garden.units :refer [px]]
            [garden.units :refer (px rem em percent)]
            [garden.selectors :refer (& h2 a hover attr attr= code > li not first-of-type nth-child first-child last-child before after) :as s]
            [garden.arithmetic :refer (* +)]
            [garden.stylesheet :refer (at-import at-media at-keyframes)]
            [clojure.string :as string]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

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
      :line-height (em 1.5)
      :padding-bottom (rem 0.2)
      :margin-bottom base/small}]
    [:h2
     {:font-size base/xx-large
      :color base/color-heading2-2
      :margin-top (* base/xx-large 2)
      :margin-bottom (* base/xx-large 1)
      :border-bottom (str "solid 3px " base/color-heading2-2)
      :position "relative"
      :line-height (* base/xx-large 1.75)}
     [:&:after
      {:position "absolute"
       :content "\" \""
       :display "block"
       :border-bottom (str  "solid 3px " base/color-heading2-1)
       :bottom "-3px"
       :width base/xxx-large}]
     [:&:first-letter
      {:color base/color-heading2-1
       :font-size base/xxx-large}]
     [(& (not first-of-type))
      {:margin-top (* base/xx-large 4)}]]
    [:h3
     {:font-size base/x-large
      :color base/color-heading3
      :margin-top (* base/xx-large 2)
      :margin-bottom base/medium}]
    [:h4
     {:margin-top base/x-small
      :background-color base/color-light-gray
      :padding "0.2rem 0.8rem"
      :margin-bottom base/x-small}]
    [(s/+ :h1 :h2)
     {:margin-top (* base/large 1)}]
    [(code (not :.hljs))
     {:color base/color-code-fg
      :background-color base/color-code-bg
      :font-size base/small
      :font-family base/font-mono
      :margin "0 0.3rem"
      :padding "0.1rem 0.8rem"}]
    [:pre
     {:margin "1rem 0 2em"}
     [:code
      {:background-color "black"
       :font-size base/small
      :padding "1em 1.2rem"
      :line-height (rem 1.2)}]]
    [:p
     {:margin "1rem 0"}]
    [:ul
     {:margin-top base/medium
      :margin-left (* base/small 2)
      :margin-bottom base/medium}]
    [:ol
     {:margin-top base/medium
      :margin-left (* base/small 2)
      :margin-bottom base/medium}]
    [:table
     [:thead {:background-color base/color-light-gray
              :border-bottom (str "3px solid" base/color-gray)}
      [:th {:padding "0.4rem 0.8rem 0.2rem"}
       [(& (not (first-of-type))) {:border-left (str "4px solid " base/color-bg)}]]]
     [:tbody
      [:tr
       [(& first-of-type)
        [:td {:padding "0.8rem 0.4rem 0.4rem"}]] ]
      [:td {:padding "0.4rem 0.4rem"}]]]
    [:blockquote
     {:color base/color-quote-fg
      :border-radius (rem 1)
      :padding (rem 3)
      :font-size (* base/small 1.2)
      :position "relative"
      :margin "1rem 0"
      :background-color base/color-quote-bg
      :quotes "'“' '”'"}
     [:&:before :&:after
      {:position "absolute"
       :font-size (rem 4)}]
     [:&:before
      {:content "open-quote"
       :top (rem 2)
       :left (px -5)}]
     [:&:after
      {:content "close-quote"
       :bottom (rem 0)
       :right 0}]
     [:p {:margin-top 0
          :margin-bottom 0}]]
    [:strong
     {:background-image "linear-gradient(transparent 30%, #efcde3 10%)"}]
    [:em
     {:background base/color-em-bg
      :font-style "normal"
      :padding-left (em 0.5)
      :padding-right (em 0.5)
      :color base/color-fg
      :border-left (str "3px solid " base/color-em-fg)
      :border-right (str "3px solid " base/color-em-fg)}]
    [:dl
     {:margin-top (rem 2)
      :margin-bottom (rem 2)
      :margin-left base/medium}
     [:dt
      {:font-weight "bold"
       :padding-left base/xx-small
       :border-left (str "4px solid " base/color-definition-fg)
       :color base/color-definition-fg
       :background-color base/color-definition-bg}]
     [:dd
      {:margin-left base/xx-large
       :margin-top (rem 1)
       :margin-bottom base/medium
       :font-size base/medium}
      [:code
       {:font-size base/medium}]]]
    [:sup
     {:vertical-align "super"
      :font-size (em 0.5)}]
    [:sub
     {:vertical-align "sub"
      :font-size (em 0.5)} ]]
   [:.p-article__footer
    {:margin-top (rem 5)}
    [:hr
     {:border-top (str "2px solid" base/color-fg)
      :margin (px 0)}
     [:&:before
      {:content "\"\""
       :display "block"
       :border-top (str "2px solid " base/color-fg)
       :margin-top "2px"}]]]
   [:.p-article__tags
    {:list-style-type  "none"
     :display  "flex"
     :flex-direction  "row"
     :align-items  "center"
     :justify-content  "flex-end"
     :flex-wrap  "wrap"}]
   [:.p-article__tags__tag
    {:font-family base/font-sans-serif}
     [:a {:color base/color-gray
          :display "inline-block"
          :font-size base/medium
          :background-color base/color-light-gray
          :padding "10px"
          :border-radius (px 5)
          :font-family base/font-sans-serif}
      [:&:hover
      {:background-color base/color-gray
       :color base/color-bg
       :transition "all .25s ease-in"
       :text-decoration "none"}]]
     [(& first-child)
       {:padding  "0 3px 0 0"}]
     [(&  (not first-child))
       {:padding  "0 3px 0 3px"}]]
  [:.p-article__related
   {:margin-top (rem 1)}]
  [:.p-article__related__title
   {:padding "5px 10px"
    :font-size base/x-large
    :position "relative"
    :margin-top (rem 1.5)
    :border-left (str "5px solid " base/color-fg)}
   [:&:after
    {:position "absolute"
     :content "\"\""
     :display "block"
     :border-left (str  "solid 5px " base/color-heading2-1)
     :left "-5px"
     :top "-5px"
     :height base/medium
     }]]
  [:.p-article__related__articles
   {:margin-top (px 5)
    :margin-left (px 19)}]
  [:.p-article__related__article
   {:padding-top (rem 0.5)
    :font-size base/medium}]])

