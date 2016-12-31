(defproject jp.nijohando/rokkaku "1.0"
  :plugins [[lein-garden "0.3.0"]]
  :garden {:builds [{;; Optional name of the build:
                     :id "screen"
                     ;; Source paths where the stylesheet source code is
                     :source-paths ["src"]
                     ;; The var containing your stylesheet:
                     :stylesheet jp.nijohando.rokkaku.style.core/main
                     ;; Compiler flags passed to `garden.core/css`:
                     :compiler {;; Where to save the file:
                                :output-to "static/css/theme.css"
                                ;; Compress the output?
                                :pretty-print? false}}]})
