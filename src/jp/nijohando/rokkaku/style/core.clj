(ns jp.nijohando.rokkaku.style.core
  (:refer-clojure :exclude [rem > not])
  (:require [garden.def :refer [defstyles]]
            [jp.nijohando.rokkaku.style.foundation.base :as base]
            [jp.nijohando.rokkaku.style.foundation.reset :as reset]
            [jp.nijohando.rokkaku.style.layout.global :as global]
            [jp.nijohando.rokkaku.style.layout.pane :as pane]
            [jp.nijohando.rokkaku.style.layout.header :as header]
            [jp.nijohando.rokkaku.style.layout.main :as main]
            [jp.nijohando.rokkaku.style.layout.footer :as footer]
            [jp.nijohando.rokkaku.style.project.signboard :as signboard]
            [jp.nijohando.rokkaku.style.project.articles :as articles]
            [jp.nijohando.rokkaku.style.project.tail :as tail]
            [jp.nijohando.rokkaku.style.project.article :as article]
            [jp.nijohando.rokkaku.style.project.highlight :as highlight]
            [jp.nijohando.rokkaku.style.component.brand :as brand]
            [jp.nijohando.rokkaku.style.component.stamp :as stamp]
            [jp.nijohando.rokkaku.style.component.calendar :as calendar]
            [jp.nijohando.rokkaku.style.component.heading :as heading]))

(defstyles main
  (reset/all)
  (global/layout)
  (pane/layout)
  (header/layout)
  (main/layout)
  (footer/layout)
  (brand/component)
  (stamp/component "small" 60 12 10 2 2 "#c24541")
  (stamp/component "large" 200 40 36 4 8 "#333333")
  (calendar/component)
  (heading/component)
  (signboard/project)
  (articles/project)
;  (highlight/project)
  (article/project)
  (tail/project))
