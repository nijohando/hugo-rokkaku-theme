(ns jp.nijohando.rokkaku.style.project.tail
  (:refer-clojure :exclude [rem > not])
  (:require [garden.units :refer (px rem)]
            [garden.selectors :refer (& a hover > first-of-type)]
            [jp.nijohando.rokkaku.style.foundation.base :as base]))

(defn project
  []
  [[:.p-tail
    {:display "flex"
     :flex-direction "column"
     :font-size base/medium}
    [(> a)
     {:color base/color-bg}]
    [(( > a) hover)
     {:text-decoration "underline"
      :color base/color-fg}]
    ]
   [:.p-tail__years
    {:display "flex"
     :flex-wrap "wrap"
     :justify-content "flex-end"
     :list-style-type "none"
     :font-family base/web-font1
     :background-color base/color-fg-sub
     :padding-top (rem 0.5)
     :padding-right (rem 1.5)}]
   [:.p-tail__years__year
    {:padding-left (rem 1)
     :padding-top (rem 0.5)
     :font-size base/small}]
   [:.p-tail__tags
    {:display "flex"
     :flex-wrap "wrap"
     :justify-content "flex-end"
     :list-style-type "none"
     :font-family base/web-font1
     :background-color base/color-fg-sub
     :padding-right (rem 1.5)
     :padding-bottom (rem 1)}]
   [:.p-tail__tags__tag
    {:padding-left (rem 1)
     :padding-top (rem 0.5)
     :font-size base/small}]
   [:.p-tail__end
    {:display "flex"
     :align-items "stretch"
     :border-top (str "2px solid #555555")
     :justify-content "flex-end"}
    ]
   [:.p-tail__copyright
    {:font-family base/web-font1
     :padding-right base/large
     :font-size (rem 0.8)
     :color base/color-fg-sub
     :padding (rem 1)
     }]])

