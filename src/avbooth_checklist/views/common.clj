(ns avbooth-checklist.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "avbooth-checklist"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))
