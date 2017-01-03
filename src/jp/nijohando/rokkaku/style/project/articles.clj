(ns jp.nijohando.rokkaku.style.project.articles
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem percent)]
            [garden.stylesheet :refer (at-media)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn project
  []
  [[:.p-articles]
   [:.p-articles__title
    {:text-align "center"
     :font-size base/xx-large
     :margin-bottom base/large}]
   [:.p-articles__heading
    {:display "flex"}
    [:.c-heading
     {:margin-bottom base/large}]]
   [:.p-articles__footer
    {:display "flex"}]
   [:.p-articles__footer__left--some :.p-articles__footer__left--none
    {:width (rem 4)
     :padding-top (px 5)
     :padding-bottom (px 5)
     :padding-right (px 10)}]
   [:.p-articles__footer__left--some
    {:border-right (str "2px dotted" base/color-fg)}]
   [:.p-articles__footer__left--none
    {:border-right (str "2px solid" base/color-fg)}]
   [:.p-articles__footer__right
    {:width (percent 100)
     :padding-top (rem 3)
     :padding-bottom (rem 2)
     :text-align "right"
     :color base/color-dark-gray}]
   [(at-media {:max-width (px 599)}
              [:.p-articles__footer__left--some :.p-articles__footer__left--none
               {:width (rem 3)
                :padding-right (px 5)}])]])

