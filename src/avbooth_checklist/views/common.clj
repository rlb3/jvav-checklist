(ns avbooth-checklist.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5 include-js]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "JV Audio / Video Booth checklist"]
               (include-css "/css/bootstrap.min.css")
               (include-css "/css/bootstrap-responsive.min.css")
               (include-js "/js/bootstrap.min.js")]
              [:body
               [:div#wrapper
                content]]))
