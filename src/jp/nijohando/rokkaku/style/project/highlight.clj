(ns jp.nijohando.rokkaku.style.project.highlight
  (:refer-clojure :exclude [rem not > * +])
  (:require [jp.nijohando.rokkaku.style.foundation.base :as base]
            [garden.selectors :refer (& h2 a hover attr attr= attr-matches pre code > li not first-of-type nth-child first-child last-child before after) :as s]
            [garden.units :refer (px rem)]))

(defn project
  []
  [[:code
    {:background-color base/color-code-bg
     :color base/color-code-fg
     :font-size base/small
     :border-radius (rem 0.2)
     :padding "0.2em 0.5em"
     }]
   [(code (attr-matches "class" "language-")) (pre (attr-matches "class" "language-"))
    {:color base/highlight-inline-code
     :background 'none
     :font-family base/font-mono
     :font-size base/small
     :line-height base/large
     :text-align 'left
     :white-space 'pre
     :word-spacing 'normal
     :word-break 'normal
     :word-wrap 'normal
     :-moz-tab-size 4
     :-o-tab-size 4
     :-webkit-hyphens 'none
     :-moz-hyphens 'none
     :-ms-hyphens 'none
     :hyphens "none"}]
   [(pre (attr-matches "class" "language-"))
    {:padding (rem 1)
     :margin "0.5em 0"
     :overflow 'auto}]
   [(> (not pre) (code (attr-matches "class" "language-"))) (pre (attr-matches "class" "language-"))
    {:background-color base/highlight-background}]
   [(> (not pre) (code (attr-matches "class" "language-")))
    {:padding (rem 0.1)
     :border-radius (rem 0.3)
     :white-space 'normal}]
   [:.token.comment
    {:color base/highlight-comment}]
   [:.token.block-comment
    {:color base/highlight-block-comment}]
   [:.token.prolog
    {:color base/highlight-prolog}]
   [:.token.doctype
    {:color base/highlight-doctype}]
   [:.token.cdata
    {:color base/highlight-cdata}]
   [:.token.punctuation
    {:color base/highlight-punctuation}]
   [:.token.tag
    {:color base/highlight-tag}]
   [:.token.attr-name
    {:color base/highlight-attr-name}]
   [:.token.namespace
    {:color base/highlight-namespace}]
   [:.token.deleted
    {:color base/highlight-deleted}]
   [:.token.function-name
    {:color base/highlight-function-name}]
   [:.token.boolean
    {:color base/highlight-boolean}]
   [:.token.number
    {:color base/highlight-number}]
   [:.token.function
    {:color base/highlight-function}]
   [:.token.property
    {:color base/highlight-property}]
   [:.token.class-name
    {:color base/highlight-class-name}]
   [:.token.constant
    {:color base/highlight-constant}]
   [:.token.symbol
    {:color base/highlight-symbol}]
   [:.token.selector
    {:color base/highlight-selector}]
   [:.token.important
    {:color base/highlight-important
     :font-weight 'bold}]
   [:.token.atrule
    {:color base/highlight-atrule}]
   [:.token.keyword
    {:color base/highlight-keyword}]
   [:.token.builtin
    {:color base/highlight-builtin}]
   [:.token.string
    {:color base/highlight-string}]
   [:.token.char
    {:color base/highlight-char}]
   [:.token.attr-value
    {:color base/highlight-attr-value}]
   [:.token.regex
    {:color base/highlight-regex}]
   [:.token.variable
    {:color base/highlight-variable}]
   [:.token.operator
    {:color base/highlight-operator}]
   [:.token.entity
    {:color base/highlight-entity
     :cursor 'help}]
   [:.token.url
    {:color base/highlight-url}]
   [:.token.bold
    {:font-weight 'bold}]
   [:.token.italic
    {:font-style 'italic}]
   [:.token.inserted
    {:color base/highlight-inserted}]])

