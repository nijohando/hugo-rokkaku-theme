(ns jp.nijohando.rokkaku.style.foundation.base
  (:refer-clojure :exclude [rem not >])
  (:require [clojure.string :as string]
            [garden.units :refer (rem)]))

(def color-snow "rgb(252,252,252)")
(def color-charcoal "rgb(66,66,66)")
(def color-gray "rgb(152,152,152)")
(def color-dark-gray "#555555")
(def color-brick-red "rgb(140,71,86)")
(def color-haze "#eae5e3")
(def color-light-gray "#f2f2f2")
(def color-flint "#706b63")
(def color-spring-wood "#f6f3eb")

(def color-bg color-snow)
(def color-fg color-charcoal)
(def color-fg-sub color-gray)
(def color-code-fg color-fg)
(def color-code-bg color-spring-wood)
(def color-em-bg "rgb(192,202,156)")
(def color-em-fg "rgb(166,186,165)")
(def color-link-fg color-brick-red)
(def color-sub-pane color-haze)
(def color-quote-fg color-flint)
(def color-quote-bg color-spring-wood)
(def color-definition-fg "#555555")
(def color-definition-bg color-light-gray)
(def color-heading2-1 color-brick-red)
(def color-heading2-2 color-charcoal)
(def color-heading3 color-charcoal)

(def SawarabiMincho "Sawarabi Mincho")
(def IstokWeb "Istok Web")
(def Robot "Roboto Mono")

(defn font
  [x & more]
  (->> (cons x more)
       (map #(str "'" % "'"))
       (string/join ",")))

(def Regular #(str % "-Regular"))
(def Medium #(str % "-Medium"))
(def Demibold #(str % "-Demibold"))

(def SansSerif #(str % "," "sans-serif;"))
(def Monospace #(str % "," "monospace;"))

(def web-font0 (font SawarabiMincho))
(def web-font1 (-> (font IstokWeb) SansSerif))
(def web-font2 (-> (font Robot) Monospace))

(def font-serif web-font0)
(def font-sans-serif web-font1)
(def font-mono web-font2)
(def font-default font-serif)
(def font-brand-title font-serif)
(def font-hr font-serif)

(def xxx-small (rem 0.3))
(def xx-small (rem 0.5))
(def x-small (rem 0.7))
(def small (rem 0.9))
(def medium (rem 1.0))
(def large (rem 1.2))
(def x-large (rem 1.4))
(def xx-large (rem 1.6))
(def xxx-large (rem 2.0))

