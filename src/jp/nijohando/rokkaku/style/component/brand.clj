(ns jp.nijohando.rokkaku.style.component.brand
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer [px]]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn component
  []
  [[:.c-brand
    {:display "flex"
     :flex-direction "row"
     :align-items "center"}
    [:h1
     {:font-family base/font-brand-title
      :font-size base/xxx-large
      :padding (px 0)
      :margin "0 0 0 1rem"}]]])

