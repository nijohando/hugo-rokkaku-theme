(ns jp.nijohando.rokkaku.style.project.highlight
  (:refer-clojure :exclude [rem])
  (:require [jp.nijohando.rokkaku.style.foundation.base :as base]
            [garden.units :refer (px rem)]))

(defn project
  []
  [[:.hljs
    {:font-family base/font-mono}]])

