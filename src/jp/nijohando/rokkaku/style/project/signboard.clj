(ns jp.nijohando.rokkaku.style.project.signboard
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem em percent)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn project
  []
  [[:.p-signboard
    {}]
   [:.p-signboard__top-link
    {:color base/color-fg}
    [:&:hover
     {:text-decoration "none"}]]])

