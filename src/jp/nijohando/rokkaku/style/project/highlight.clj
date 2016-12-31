(ns jp.nijohando.rokkaku.style.project.highlight
  (:refer-clojure :exclude [rem])
  (:require [jp.nijohando.rokkaku.style.foundation.base :as base]
            [garden.units :refer (px rem)]))

(defn project
  []
  [[:.hljs-comment
    :.hljs-quote
    {:color "#999999"}]
   [:.hljs-variable
    :.hljs-template-variable
    :.hljs-tag :.hljs-name
    :.hljs-selector-id
    :.hljs-selector-class
    :.hljs-regexp
    :.hljs-deletion
    {:color "#D45D87"}]
   [:.hljs-number
    :.hljs-built_in
    :.hljs-builtin-name
    :.hljs-literal
    :.hljs-type
    :.hljs-params
    :.hljs-meta
    :.hljs-link
    {:color "#C44816"}]
   [:.hljs-attribute
    {;light blue
     :color "#1C88A6"}]
   [:.hljs-string
    :.hljs-symbol
    :.hljs-bullet
    :.hljs-addition
    {;green
     :color "#4A9E3D"}]
   [:.hljs-title
    :.hljs-section
    {;Blue
     :color "#3261AB"}]
   [:.hljs-keyword
    :.hljs-selector-tag
    {;purple
     :color "#693A8A"}]
   [:.hljs
    {:display "block"
     :overflow-x "auto"
     :font-size base/small
     :font-family base/font-mono
     :margin-top base/large
     :margin-bottom base/large
     :line-height (rem 1.3)
     :border "1px solid #E6E6E6"
     :background-color base/color-code-bg
     :color base/color-code-fg
     :padding (let [tb 0.8
                    lr 1]
                (str tb"rem " lr "rem "))}]
   [:hljs-emphasis
    {:font-style "italic"}]
   [:hljs-strong
    {:font-weight "bold"}]])

