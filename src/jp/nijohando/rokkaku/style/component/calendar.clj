(ns jp.nijohando.rokkaku.style.component.calendar
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem)]
            [garden.stylesheet :refer (at-media)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn component
  []
  [[:.c-calendar
    {:display "flex"
     :flex-direction "column"
     :color base/color-fg
     :border-right (str "2px solid " base/color-fg)
     :padding-right (px 10)
     :width (rem 4)}]
   [:.c-calendar__month
    {:font-size base/small
     :text-align "center"}]
   [:.c-calendar__day-of-month
    {:font-size base/xx-large
     :text-align "center"
     :padding-top (px 3)
     :padding-bottom (px 3)}]
   [:.c-calendar__day-of-week
    {:text-align "center"
     :font-size base/small
     :letter-spacing (px 1)}]
   [(at-media {:max-width (px 599)}
              [:.c-calendar
               {:padding-right (px 5)
                :width (rem 3)}]
              [:.c-calendar__month
               {:font-size base/x-small}]
              [:.c-calendar__day-of-month
               {:font-size base/x-large}]
              [:.c-calendar__day-of-week
               {:font-size base/x-small}])]])
